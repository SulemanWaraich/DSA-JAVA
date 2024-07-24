package Infix_to_Postfix;

public class InfixToPostfix {
    static class Node {
        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node top;

        public Stack() {
            this.top = null;
        }

        public void push(char data) {
            Node newNode = new Node(data);
            if (top == null) {
                top = newNode;
            } else {
                newNode.next = top;
                top = newNode;
            }
        }

        public char pop() {
            if (top == null) {
                return '\0'; // Indicating the stack is empty
            }
            char data = top.data;
            top = top.next;
            return data;
        }

        public char peek() {
            if (top == null) {
                return '\0'; // Indicating the stack is empty
            }
            return top.data;
        }

        public boolean isEmpty() {
            return top == null;
        }
    }

    public static class InfixToPostfixClass {
        private static int precedence(char ch) {
            switch (ch) {
                case '+':
                case '-':
                    return 1;
                case '*':
                case '/':
                    return 2;
                case '|':
                    return 0; // Assuming '|' has the lowest precedence
                case '^':
                    return 3; // Adding precedence for exponentiation if needed
            }
            return -1;
        }

        public static String infixToPostfix(String expression) {
            StringBuilder result = new StringBuilder();
            Stack stack = new Stack();

            for (int i = 0; i < expression.length(); ++i) {
                char c = expression.charAt(i);

                // If the scanned character is an operand, add it to output
                if (Character.isLetterOrDigit(c)) {
                    result.append(c);
                }
                // If the scanned character is '(', push it to the stack
                else if (c == '(') {
                    stack.push(c);
                }
                // If the scanned character is ')', pop and output from the stack
                // until an '(' is encountered
                else if (c == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        result.append(stack.pop());
                    }
                    if (!stack.isEmpty() && stack.peek() != '(') {
                        return "Invalid Expression"; // Invalid expression
                    } else {
                        stack.pop();
                    }
                } else { // an operator is encountered
                    while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                        result.append(stack.pop());
                    }
                    stack.push(c);
                }
            }

            // pop all the operators from the stack
            while (!stack.isEmpty()) {
                if (stack.peek() == '(') {
                    return "Invalid Expression"; // Invalid expression
                }
                result.append(stack.pop());
            }
            return result.toString();
        }
    }

    public static void main(String[] args) {
        String expression = "A+(B*C-(D/E|F)*G)*H";
        System.out.println(InfixToPostfixClass.infixToPostfix(expression));
    }
}

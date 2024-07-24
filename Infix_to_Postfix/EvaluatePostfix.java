package Infix_to_Postfix;

public class EvaluatePostfix {
    static class Stack {
        private int[] arr;
        private int top;
        private int capacity;

        // Constructor to initialize stack
        Stack(int size) {
            arr = new int[size];
            capacity = size;
            top = -1;
        }

        // Utility function to add an element `x` to the stack
        public void push(int x) {
            if (isFull()) {
                throw new RuntimeException("Overflow\nProgram Terminated\n");
            }

            arr[++top] = x;
        }

        // Utility function to pop a top element from the stack
        public int pop() {
            // check for stack underflow
            if (isEmpty()) {
                throw new RuntimeException("Underflow\nProgram Terminated");
            }

            return arr[top--];
        }

        // Utility function to return the top element of the stack
        public int peek() {
            if (!isEmpty()) {
                return arr[top];
            } else {
                throw new RuntimeException("Underflow\nProgram Terminated");
            }
        }

        // Utility function to return the size of the stack
        public int size() {
            return top + 1;
        }

        // Utility function to check if the stack is empty or not
        public boolean isEmpty() {
            return top == -1;
        }

        // Utility function to check if the stack is full or not
        public boolean isFull() {
            return top == capacity - 1;
        }
    }

    public static class PostfixEvaluation {
        // Method to evaluate a postfix expression
        public static int evaluatePostfix(String expression) {
            // Create a stack of capacity equal to the length of the expression
            Stack stack = new Stack(expression.length());

            // Scan all characters one by one
            for (int i = 0; i < expression.length(); i++) {
                char c = expression.charAt(i);

                // If the character is a digit (operand), push it to the stack
                if (Character.isDigit(c)) {
                    stack.push(c - '0');
                } else {
                    // The character is an operator
                    // Pop two top elements from the stack
                    int val1 = stack.pop();
                    int val2 = stack.pop();

                    // Perform the operation and push the result back to the stack
                    switch (c) {
                        case '+':
                            stack.push(val2 + val1);
                            break;
                        case '-':
                            stack.push(val2 - val1);
                            break;
                        case '*':
                            stack.push(val2 * val1);
                            break;
                        case '/':
                            stack.push(val2 / val1);
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid operator: " + c);
                    }
                }
            }
            // The result is in the top of the stack
            return stack.pop();
        }

    }
    public static void main(String[] args) {
        String expression = "231*+9-"; // Example postfix expression
        System.out.println("Postfix evaluation: " + PostfixEvaluation.evaluatePostfix(expression));
    }
}

package LinkedList;

public class LL_1 {
    Node head;
    private int size;

    class Node
    {
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    public void addFirst(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null)
        {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    public void printList()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while(currNode != null)
        {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args)
    {
        LL_1 list = new LL_1();
        int Size;

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.printList();

        list.addLast("list");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deleteLast();
        list.printList();

        Size = list.getSize();
        System.out.println(Size);
    }


    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("the list is empty");
            return;
        }

        size--;
        head = head.next;
    }


    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("the list is empty");
            return;
        }

        size--;
        if(head.next == null)
        {
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize()
    {
        return size;
    }
}
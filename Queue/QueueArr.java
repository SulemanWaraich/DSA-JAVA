package Queue;

public class QueueArr {
    public static class Queue
    {
        public static int arr[];
        public static int size;
        public static int rear;

        public Queue(int n)
        {
            arr = new int[n];
            size = n;
            rear = -1;
        }

//        Check
        public boolean isEmpty()
        {
            return rear == -1;
        }

//        Enqueue
        public void add(int data)
        {
            if(rear == size-1)
            {
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }

//        Dequeue
        public int remove()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }

            int front = arr[0];
            for(int i=0; i<rear; i++)
            {
                arr[i] = arr[i+1];
            }

            rear--;
            return front;
        }

//        Peek
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String[] args)
    {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }
    }
}

public class CircularQueue {
    static class queue
    {
        static int arr[];
        static int size;
        static int rear=-1;
        static int front=-1;


        queue(int size)
        {
            arr=new int[size];
            this.size=size;

        }
        public static boolean isEmpty()
        {
            return rear==-1 && front==-1;
        }
        public static boolean isfull()
        {
            return (rear+1)%size==front;
        }

        public static void add(int data){
            if(isfull()){
                System.out.println(" overflow");
                return;
            }
            if(front==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }

        public static int remove()
        {
            if(isEmpty())
            {
                System.out.println("Empty Queue underflow");
                return -1;
            }
            int res=arr[front];
            if(front==rear)
            {
                front=rear=-1;
            }
            else{
                front=(front+1)%size;
            }
            return res;
        }


        public static int peek()
        {
            if(isEmpty())
            {
                System.out.println("Empty Queue underflow");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        queue q=new queue(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Deleted element is "+q.remove());
        q.add(6);

        System.out.println("Deleted element is "+q.remove());
        q.add(7);

        System.out.println("Elements of circular array are ");

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.remove();
        }

    }
}

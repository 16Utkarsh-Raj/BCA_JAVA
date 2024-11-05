public class circularlinkedlist {
    class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head= null;
    Node tail= null;

    public void add(int data)
    {
        Node newNode= new Node(data);
        if(head==null)
        {
            head= newNode;
            tail= newNode;
            tail.next=head;
        }
        else
        {
            tail.next = newNode;
            tail = newNode;
            tail.next=head;
        }
    }

    public int count;
    public void countNode()
    {
        Node current=head;
        do{
            count++;
            current=current.next;
        }while(current!=head);
        System.out.println("Total number of element is: "+count);
    }

    public void reverse(){
        if(head==null || head.next==head)
        {
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;


        while(currNode!=head)
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;
        }
        tail=head;
        head.next=prevNode;
        head=prevNode;
    }

    //insertion at beginning
    public void insertfirst(int data)
    {
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            tail.next=head;
        }
        else{
            newNode.next=head;
            head=newNode;
            tail.next=head;
        }

    }
    
    //deletion from beggning
    public void deleteStart(){
        if(head==null){
            return;
        }else{
            if(head!=tail){
                head=head.next;
                tail.next=head;
            }
            else{
                head=tail=null;

            }
        }
    }

    //delete from end
    public void deleteEnd(){
        if(head==null){
            return;
        }
        else{
            if(head!=tail){
                Node current=head;
                while(current.next!=tail){
                    current=current.next;
                }
                tail=current;
                tail.next=head;
            }
            else{
                head=tail=null;
            }
        }
    }

    //Find out the min value node in the list
    public void minNode(){
        Node current=head;
        int min=head.data;
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            do{
                if(min>current.data){
                    min=current.data;
                }
                current=current.next;
            }while(current!=head);
            System.out.println("Minimum value node in list is "+min);
        }
    }

    //Find out the max value node in the list
    public void maxNode(){
        Node current=head;
        int max=head.data;
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            do{
                if(max<current.data){
                    max=current.data;
                }
                current=current.next;
            }while(current!=head);
            System.out.println("Maximum value node in list is "+max);
        }
    }

    public void display()
    {
            Node current=head;
            if(head==null)
            {
                System.out.println("List is empty");
            }
            else
            {
                System.out.println("Elements of circular list are: ");
                do
                {
                    System.out.print(current.data+" ");
                    current=current.next;
                }while(current!=head);
                System.out.println();

            }
    }
    public static void main(String[] args) {
        circularlinkedlist list = new circularlinkedlist();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.display();
        list.countNode();
        list.reverse();
        list.display();
        list.insertfirst(15);
        list.display();
        list.deleteStart();
        list.display();
        list.deleteEnd();
        list.display();
        list.minNode();
        list.display();
        list.maxNode();
    }

}

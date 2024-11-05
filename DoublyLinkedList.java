public class DoublyLinkedList {
    public int size=0;
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;
            size++;
        }
    }
    Node head=null;
    Node tail=null;

    public void add(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            head.prev=null;
            tail.next=null;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
            tail.next=null;
        }
    }

    public void addStart(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            head.next=null;
            tail.next=null;
        }
        else{
            head.prev=newNode;
            newNode.next=head;
            head=newNode;
            head.prev=null;
        }
    }

    public void delFirst(){
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else{
            if(head!=tail){
                head=head.next;
                head.prev=null;
            }
            else
            {
                head=tail=null;
            }
            size--;
        }
    }

    public void delEnd()
    {
        if(head==null){
            return;
        }
        else{
            if(head!=tail){
                tail=tail.prev;
                tail.next=null;
            }
            else{
                head=tail=null;
            }
        }
    }

    public void addMid(int data,int position)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            System.out.println("The specified location is not available");
        }
        if(position<1 || position>size+1)
        {
            System.out.println("Insertion not possible");
            return;
        }
        else{
            if(position==size+1)
            {
                tail.next=newNode;
                newNode.prev=tail;
                tail=newNode;
                tail.next=null;
            }
            else if(position==1)
            {
                head.prev=newNode;
                newNode.next=head;
                newNode=null;
                head=newNode;
            }
            else{
                Node current=head;
                Node temp=null;
                for(int i=1;i<position;i++){
                    current=current.next;
                }
                temp=current.next;
                current.next=newNode;
                newNode.prev=current;
                newNode.next=temp;
                temp.prev=newNode;
            }
        }
    }

    public void delMid(int position)
    {
        if(head==null || position>size){
            System.out.println(position+" The position is not available");
        }
        else{
            if(position==1){
                head=head.next;
                head.next=null;
            }
            else if(position==size){
                tail=tail.prev;
                tail.next=null;

            }else{
                Node current=head;
                for(int i=1;i<position;i++){
                    current=current.next;
                }
                current.next.prev=current.prev;
                current.prev.next=current.next;
            }
            System.out.println("\nNode is deleted successfully");
            size--;
        }
    }

    public void reverse()
    {
        Node current=head,temp=null;
        while(current!=null){
            temp=current.next;
            current.next=current.prev;
            current.prev=temp;
            current=current.prev;
        }
        temp=head;
        head=tail;
        tail=temp;
    }

    public void dispaly()
    {
        Node current=head;
        if(head==null)
        {
            System.out.println("List is empty");
        }
        else{
            System.out.println("\nElement in the list is: ");
            while(current!=null)
            {
                System.out.print(current.data+" ");
                current=current.next;
            }
            
        }
    }

    public void searchNode(int value)
    {
        int i=0;
        boolean flag=false;
        Node current=head;
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        while(current!=null){
            if(current.data==value){
                flag=true;
                break;
            }
            current=current.next;
            i++;
        }
        if(flag)
            System.out.println("Node is present in the list at the position: "+i);
        else
            System.out.println("Node is not present in the list");
    }

    public static void main(String[] args) {
        DoublyLinkedList list=new DoublyLinkedList();
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(7);
        list.add(9);
        list.dispaly();

        list.addStart(64647);
        list.dispaly();
        
        list.delFirst();
        list.dispaly();

        list.delEnd();
        list.dispaly();

        list.addMid(45, 3);
        list.dispaly();

        list.delMid(2);
        list.dispaly();

        list.reverse();
        list.dispaly();

        list.searchNode(4);
        list.dispaly();
    }
}

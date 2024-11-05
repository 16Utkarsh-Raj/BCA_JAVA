public class linkedList {
    //Node creation
    Node head;
    private int size;

    linkedList(){
        this.size=0;
    }

    class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
 
     
    //Add at first
    public void addFirst(String data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    //Add at last
    public void addLast(String data){
        Node newnode=new Node(data);
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newnode;
    }

    //Add at mid anywhere
    public void addMid(String data, int pos){
        Node newNode=new Node(data);
        int count=1;
        if(pos<1){
            System.out.println("Invalid position");
            size--;
            return;
        }
        else if(pos==1){
            newNode.next=head;
            head=newNode;
        }
        else{
            Node curreNode=head;
            while(count<pos-1){
                curreNode=curreNode.next;
                count++;
            }
            newNode.next=curreNode.next;
            curreNode.next=newNode;
        }
    }

    //Deletion at middle
    public void delkey(String data){
        Node currNode=head;
        Node prev=null;
        //if head node holds the key
        if(currNode!=null && currNode.data==data){
            head=head.next;
            size--;
            return;
        }

        //if key is somewhere other than head
        while(currNode!=null && currNode.data!=data){
            prev=currNode;
            currNode=currNode.next;
        }
        if(currNode!=null){
            prev.next=currNode.next;
            size--;
        }
        //if key is not present
        if(currNode==null){
            System.out.println("Data not found");
        }
    }


    //Delete at first
    public void delFirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head=head.next;
    }

    //delete at last
    public void delLast(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node lasNode=head.next;
        Node secondNode=head;
        while(lasNode.next!=null){
            lasNode=lasNode.next;
            secondNode=secondNode.next;
        }
        secondNode.next=null;
    }

    //Printing the list
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }

    public int getsize() {
        return size;
    }

    public static void main(String[] args) {
        linkedList obj=new linkedList();
        obj.addFirst("a");
        obj.addFirst("is");
        obj.printList();

        obj.addLast("Last");
        obj.printList();

        obj.addFirst("This");
        obj.printList();

        obj.addMid("hello",2);
        obj.printList();
        System.out.println(obj.getsize());

        obj.delkey("a");
        obj.printList();

        obj.delFirst();
        obj.printList();

        obj.delLast();
        obj.printList();

        System.out.println("Size of list is "+obj.getsize());

        obj.addLast("Last");
        obj.printList();

        System.out.println("Size of list is "+obj.getsize());
    }
}
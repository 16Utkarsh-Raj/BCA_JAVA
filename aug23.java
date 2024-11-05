public class aug23 { 
    Node head; 
    class Node{ 
        String data; 
        Node next; 
        Node(String data){ 
            this.data=data; 
            this.next=null; 
        } 
    } 
    public void addFirst(String data){ 
        Node newnode=new Node(data); 
        if(head==null){ 
            head=newnode; 
            return; 
        } 
        newnode.next=head; 
        head=newnode; 
    } 
 
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
    public void reverse(){ 
        if(head==null || head.next==null){ 
            return; 
        } 
        Node prevNode=head; 
        Node currNode=head.next; 
 
        while(currNode!=null){ 
            Node nextNode=currNode.next; 
            currNode.next=prevNode; 
 
            prevNode=currNode; 
            currNode=nextNode; 
        } 
        head.next=null; 
        head=prevNode; 
    }
     
 
    public static void main(String[] args) { 
        aug23 obj=new aug23(); 
        obj.addFirst("This"); 
        obj.addFirst("is"); 
        obj.addFirst("a"); 
        obj.addFirst("list"); 
        obj.addFirst("end"); 
        obj.printList(); 
        obj.reverse(); 
        obj.printList(); 
         
    } 
}
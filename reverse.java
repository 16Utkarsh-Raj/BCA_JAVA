class reverse {
    static Node head;
    static class Node {
 
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }

    Node reverse01(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
 
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        reverse list = new reverse();
        list.head = new Node(4);
        list.head.next = new Node(3);
        list.head.next.next = new Node(2);
        list.head.next.next.next = new Node(1);
         
        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse01(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
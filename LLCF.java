import java.util.LinkedList;
public class LLCF{
    public static void main(String[] args) {
        LinkedList<String> List=new LinkedList<String>();

            //insertion
            List.addFirst("a");
            List.addFirst("is");
            //obj.printList();
            System.out.println(List);


            List.addLast("List");
            List.addLast("This");
            System.out.println(List);

            List.add("End");
            System.out.println(List);

            //getting size
            System.out.println(List.size());

            //traversing
            for(int i=0;i<List.size();i++){
                System.out.println(List.get(i)+" -> ");
            }
            System.out.println("null");
        
    }
}

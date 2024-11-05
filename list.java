import java.util.*;
import java.util.Collection;
import java.util.LinkedList;

public class list {
    public static void main(String[] args) {
        LinkedList<Integer>list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        Collection.sort(list);
        System.out.println(list);
        Collection.sort(list,Collection.reverseOrder());
        System.out.println(list);
        
    }
}

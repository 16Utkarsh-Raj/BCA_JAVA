public class array {
    public static void main(String[] args) {
        //int a[]={45,64,25,63};
        int a[]=new int[5];
        a[0]=24;
        a[1]=30;
        a[2]=70;
        a[3]=45;
        a[4]=67;
        a[6]=65; //not run because index out of bound-+
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}

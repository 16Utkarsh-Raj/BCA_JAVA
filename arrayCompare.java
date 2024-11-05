import java.util.Scanner;

public class arrayCompare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number you want in array");
        int n1=sc.nextInt();
        int a[]=new int[n1];
        int i;
        System.out.println("Enter array elements ");
        for(i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter how many number you want in array");
        int n2=sc.nextInt();
        int b[]=new int[n2];
    
        System.out.println("Enter array elements ");
        for(i=0;i<n2;i++){
            b[i]=sc.nextInt();
        }
        if(a.length==b.length){
            for(i=0;i<a.length;i++){
                if(a[i]!=b[i]){
                    System.out.println("Array are not equal");
                    break;
                }
            }
            if(i==a.length)
            System.out.println("Array are equal");
        }
        else
        System.out.println("Array are not equal");
    }
}

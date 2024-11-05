import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element you want ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        System.out.println("Enter array elements ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Insorted array is ");
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
            

    }
}

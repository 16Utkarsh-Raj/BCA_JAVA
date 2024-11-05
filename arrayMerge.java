import java.util.Scanner;

public class arrayMerge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number you want in array");
        int n1=sc.nextInt();
        int a[]=new int[n1];
        int i,j=0;
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
        int c[]=new int[n1+n2];
        for(i=0;i<a.length;i++){
            c[j++]=a[i];
        }
        for(i=0;i<b.length;i++){
            c[j++]=b[i];
        }
        System.out.print("After merging array is ");
        for(i=0;i<c.length;i++)
        System.out.print(c[i]+" ");
    }
}
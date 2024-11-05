import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number you want ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,sum=0;
        System.out.println("Enter array elements ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println("Sum of array elements= "+sum);
    }
}

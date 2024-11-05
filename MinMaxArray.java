import java.util.Scanner;

public class MinMaxArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number you want ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,min,max;
        System.out.println("Enter array elements ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        min=max=a[0];
        for(i=1;i<n;i++){
            if(min>a[i])
            min=a[i];
            else if(max<a[i])
            max=a[i];
        }
        System.out.println("Minimum of array elements= "+min);
        System.out.println("Maximum of array elements= "+max);
    }
}

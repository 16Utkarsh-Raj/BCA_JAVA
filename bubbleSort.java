import java.util.Scanner;
public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of element you want ");
        int n=sc.nextInt();
        int a[]=new int[n];
        int i,j,temp=0;
        System.out.println("Enter array elements ");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Insorted array is ");
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");

        
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("\nSorted Array is  ");
        for(i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
    
}

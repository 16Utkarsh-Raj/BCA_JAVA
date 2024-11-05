import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many element do you want to enter in array 1 ");
        int n1=sc.nextInt();
        int a[]=new int[n1];

        int i,found=0;
        System.out.println("Enter elements of array 1");
        for(i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter array element you want to search ");
        int search=sc.nextInt();
        
        for(i=0;i<a.length;i++){
            if(search==a[i]){
                System.out.println("Array found at postion "+(i+1));
                found=1;
                break;
            }
        
        }
        if(found==0)
            System.out.println("Array element not found ");
    }
}

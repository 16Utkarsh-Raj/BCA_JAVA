import java.util.Scanner;
public class binarySearch {
    public static void main(String[] args) {
        int last,first,middle;
        Scanner sc=new Scanner(System.in);
        System.out.println("How many element do you want to enter in array 1 ");
        int n1=sc.nextInt();
        int a[]=new int[n1];

        int i;
        System.out.println("Enter elements of array 1");
        for(i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter array element you want to search ");
        int search=sc.nextInt();
        first=0;
        last=n1-1;
        middle=(first+last)/2;

        while(first <= last )
        {
            if(a[middle]<search)
                first=middle+1;
            else if(a[middle]==search)
            {
                System.out.println(search + " found at location " + (middle + 1) + ".");
                break;
            }
            else
            {
                last = middle - 1;
            }
            middle = (first + last)/2;
        }
        if ( first > last )
            System.out.println(search + " is not found.\n");

    }
}

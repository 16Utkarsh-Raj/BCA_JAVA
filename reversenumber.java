import java.util.Scanner;

public class reversenumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int num=sc.nextInt();
        int temp,rev=0;
        while(num>0)
        {
            temp=num%10;
            rev=rev*10+temp;
            num/=10;
        }
        System.out.println("Reverse of entered number= "+rev);
    }
}

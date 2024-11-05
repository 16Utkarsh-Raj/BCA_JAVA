import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int num=sc.nextInt();
        int temp,rev=0,actual_num=0;
        actual_num=num;
        while(num>0)
        {
            temp=num%10;
            rev=rev*10+temp;
            num/=10;
        }
        if(rev==actual_num)
        System.out.println("Palindrome ");
        else
        System.out.println("Not Palindrome ");
    }
}

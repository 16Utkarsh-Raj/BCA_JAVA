import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int num=sc.nextInt();
        int temp,rev=0;
        while(num>0)
        {
            temp=num%10;
            rev=rev*10+temp;
            num/=10;
        }

    }
}

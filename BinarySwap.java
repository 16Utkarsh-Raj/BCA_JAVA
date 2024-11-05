import java.util.Scanner;
public class BinarySwap {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a=input.nextInt();
        System.out.print("Enter a second number: ");
        int b=input.nextInt();

        a=a^b;
        b=a^b;
        a=a^b;

        System.out.println("A = "+a+" and B = "+b);
    }
}

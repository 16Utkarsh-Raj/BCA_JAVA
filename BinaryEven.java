import java.util.Scanner;
public class BinaryEven {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a=input.nextInt();
        if((a&1)==0)
            System.out.println(a+" is Even");
        else
            System.out.println(a+" is Odd");
    }
}

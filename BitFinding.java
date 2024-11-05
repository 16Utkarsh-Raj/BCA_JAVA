import java.util.Scanner;

public class BitFinding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println("Num in binary form is "+Integer.toBinaryString(n));
        System.out.println("Enter the bit to find ");
        int i=sc.nextInt();
        //finding bit
        int mask=1<<i;
        int result=n&mask;
        
        if(result!=0)
            System.out.println("Bit is 1");
        else
            System.out.println("Bit is 0");
    }
}

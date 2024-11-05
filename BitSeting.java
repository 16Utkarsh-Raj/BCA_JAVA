import java.util.Scanner;

public class BitSeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number ");
        int n=sc.nextInt();
        System.out.println("Num in binary form is "+Integer.toBinaryString(n));
        System.out.println("Enter the bit to find ");
        int i=sc.nextInt();
        //seting bit
        int mask=1<<i;
        int result=n|mask;
        
        System.out.println("after seting binary form is"+Integer.toBinaryString(result));
    }
}

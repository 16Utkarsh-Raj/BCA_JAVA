import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int n=sc.nextInt();
        int i,fact=1;
        for(i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}

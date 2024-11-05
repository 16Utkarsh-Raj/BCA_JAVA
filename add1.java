import java.util.Scanner;

public class add1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter First number ");
        int x1=sc.nextInt();
        System.out.print("Enter Second number ");
        int x2=sc.nextInt();
        int p=x1+x2;
        System.out.println("Add Result  "+x1+"+"+x2+"="+p);
    }
}

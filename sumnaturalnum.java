import java.util.Scanner;

public class sumnaturalnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many natural number you want to input ");
        int n=sc.nextInt();
        int i=0,sum=0;
        for(i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}

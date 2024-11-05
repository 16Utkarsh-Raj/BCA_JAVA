import java.util.Scanner;

public class naturalnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter how many natural number you want to input ");
        int n=sc.nextInt();
        int i;
        System.out.print(n+" Natural number is ");
        for(i=0;i<n;i++){
            System.out.print(i+" ");
        }
    }
}

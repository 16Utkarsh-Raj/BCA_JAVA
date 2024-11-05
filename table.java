import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number ");
        int num=sc.nextInt();
        int i,res;
        for(i=1;i<=10;i++){
            res=num*i;
            System.out.println(num+" * "+i+" = "+res);
        }
    }
}

import java.util.Scanner;

public class factorialFunction {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        else{
            return(n*fact(n-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number ");
        int num=sc.nextInt();
        int result=fact(num);
        System.out.println("Factorial of given number is "+result);
    }
}

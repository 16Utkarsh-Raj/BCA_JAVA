import java.util.Scanner;

public class evenodd {
    public static void main(String ar[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number you want ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println(+num+" is Even number");
        }
        else{
            System.out.println(+num+" is Odd Number");
        }
    }
}

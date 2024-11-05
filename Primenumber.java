import java.util.Scanner;

class Primenumber{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number ");
        int n=sc.nextInt();
        int i,flag=0;
        for(i=2;i<=n/2;i++){
            if(n%i==0){
                flag=1;
            }
        }
        if(flag==0)
            System.out.println(n+" is a prime number");
        else
            System.out.println(n+" is not a prime number");
    }
}
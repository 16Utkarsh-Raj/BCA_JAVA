import java.util.Scanner;
public class characterCount {
    static int charac(String str){
        if(str=="")
        {
            return 0;
        }
        else{
            return charac(str.substring(1))+1;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string ");
        String st=sc.nextLine();
        int result=charac(st);
        System.out.println("Count of entered character is "+result);
    }
}

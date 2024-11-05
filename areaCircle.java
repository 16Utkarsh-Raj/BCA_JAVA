import java.util.Scanner;
class areaCircle {
    public static void main(String ar[]){
        Scanner input=new Scanner(System.in);
        double a,r,p;
        System.out.print("Enter the radius of circle= ");
        r=input.nextDouble();
        a=3.14*r*r;
        p=2*3.14*r;
        System.out.println("Area of circle is= "+a);
        System.out.println("Perimeter of circle is= "+p);
    }
}

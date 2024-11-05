/*public class pattern {
    public static void main(String[] args) {
        int i,j;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
*/
public class pattern {
    public static void main(String[] args) {
        int i,j,n=5;
        
        for(i=0;i<n;i++)
        {
            for(j=n-1;j>1;j--)
            {
                System.out.print(" ");
            }
                for(j=0;j<=i;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            //System.out.println();
        }
    }

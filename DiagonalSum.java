import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,j,sum=0;
        System.out.println("How many element do you want to enter in rows ");
        int row=sc.nextInt();

        System.out.println("How many element do you want to enter in column ");
        int col=sc.nextInt();
        
        int[][] mat = new int[row][col];
 
        System.out.println("Enter the elements of the matrix") ;
        for(i=0;i<row;i++)
        { 
            for(j=0;j<col;j++)
            { 
                mat[i][j] = sc.nextInt();
            }
        }
    
        System.out.println("The elements of the matrix") ;
        for(i=0;i<row;i++)
        { 
            for(j=0;j<col;j++)
            { 
                System.out.print(mat[i][j]+"\t");
            }
                System.out.println("");
        }

        for(i=0;i<row;i++)
    	{ 
	    	for(j=0;j<col;j++)
	    	{ 
				if(i==j)	//this condition checks for diagonal
				{
					sum = sum + mat[i][j];
				}
    		}
		}

        System.out.println("Sum of diagonal of matrix is "+sum);
    }
}


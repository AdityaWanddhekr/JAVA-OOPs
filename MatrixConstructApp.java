import java.util.*;
public class MatrixConstructApp
{
    /*
         WAP which contains an integer matrix of size 2x2 as a data member and assign the 
         values to the matrix using parameterized constructor and create a method in the same 
         class called getTranspose() which returns the transpose of the matrix to the Main class 
    */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the row : ");
        int r=sc.nextInt();
        System.out.println("Enter the size of the column : ");
        int c=sc.nextInt();

        int a[][]=new int[r][c];

        System.out.println("Enter the element of matrix : ");
        for(int i=0;i<a.length;i++){
           for(int j=0;j<a[0].length;j++)
           {
              a[i][j]=sc.nextInt();
           }
        }

        System.out.println("The original matrix is: ");
        for(int i=0;i<a.length;i++){
           for(int j=0;j<a[0].length;j++)
           {
              System.out.print(a[i][j]+" ");
           }
          System.out.println();
        }

        MatrixApp m=new MatrixApp(a);

        Transpose t=new Transpose();
        int tm[][]=t.getTransPose(m);
        
        System.out.println("The Transpose matrix is: ");
        for(int i=0;i<tm.length;i++){
           for(int j=0;j<tm[0].length;j++)
           {
              System.out.print(tm[i][j]+" ");
           }
          System.out.println();
        }

    }
}
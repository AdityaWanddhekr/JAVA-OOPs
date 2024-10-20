import java.util.*;
public class PrincipleMatrixApp
{
    /*
        WAP to create a class called matrix which contains an integer matrix of size 3x3 and 
        assign the value to the matrix using parameterized constructor. Now send this object of this 
        matrix class to the function called getPrincipalElements() of class called Elements and return the 
        elements in an array.
    */
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of r : ");
         int r=sc.nextInt();
         System.out.println("Enter the size of c : ");
         int c=sc.nextInt();

         int a[][]=new int[r][c];

         System.out.println("Enter the element of the matrix : ");
         for(int i=0;i<a.length;i++)
         {
           for(int j=0;j<a[0].length;j++)
           {
              a[i][j]=sc.nextInt();
           }
         }

         System.out.println("The matrix is : ");
         for(int i=0;i<a.length;i++)
         {
           for(int j=0;j<a[0].length;j++)
           {
              System.out.print(a[i][j]+" ");
           }
          System.out.println();
         }

 
         MatrixPrinciple m=new MatrixPrinciple(a);
         
         ArrayPrinciple ap=new ArrayPrinciple();
         int p[]=ap.getPrinciple(m);
          
         System.out.println("The matrix is : ");
        
           for(int j=0;j<p.length;j++)
           {
              System.out.print(p[j]+" ");
           }
          

    }
}
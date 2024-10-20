import java.util.*;
public class BelowSecondary
{
    /*
       WAP to create a class called matrix which contains an integer matrix of size 3x3 and 
       assign the value to the matrix using parameterized constructor. 
       Now send this object of   this matrix class to the 
       function called getaboveSecondaryDiagonalElements() of class called Elements 
       and return the elements in an array. and getBelowSecondaryDiagonalElements().
    */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the r : ");
        int r=sc.nextInt();
        System.out.println("Enter the size of the c : ");
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
  
        System.out.println("Enter the element of the matrix : ");
        for(int i=0;i<a.length;i++)
        {
           for(int j=0;j<a[0].length;j++)
           {
              System.out.print(a[i][j]+" ");
           }
         System.out.println();
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

        MatrixCon m=new MatrixCon(a);
  
        Belowbove b=new Belowbove();

        int below[]=b.getBelowSecondary(m);
        System.out.println("The below elements are : ");
        for(int i=0;i<below.length;i++)
        {
            System.out.print(below[i]+" ");
        }

        System.out.println();
        int above[]=b.getAboveSecondary(m);
        System.out.println("The above elements are : ");
        for(int i=0;i<above.length;i++)
        {
            System.out.print(above[i]+" ");
        }
    }
}
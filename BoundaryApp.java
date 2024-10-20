import java.util.*;
public class BoundaryApp
{
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

       MatrixB m=new MatrixB(a);
       
       Boundary b=new Boundary();
       int Bon[]=b.getBoundaryEle(m);
   
       System.out.println("The boundary elements are : ");
       for(int i=0;i<Bon.length-1;i++){
         if(Bon[i]!=0){
             System.out.print(Bon[i]+" ");
         }
         else{
             System.out.print(" ");
         }
       }
    }
}
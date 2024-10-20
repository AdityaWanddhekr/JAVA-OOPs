import java.util.*;
public class NormTransApp
{
    /*
       WAP to create a class called matrix which contains an integer matrix of size 3x3 and 
       assign the value to the matrix using parameterized constructor. Now send this object of 
       this matrix class to the function called getNormTransnorm() of class called Transnorm 
       and return the trans and normal by embedding into object of class called Datakeeper and 
       print trans and normal at main. 
    */
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the r : ");
       int r=sc.nextInt();
       System.out.println("Enter the size of the c : ");
       int c=sc.nextInt();
 
       int mat[][]=new int[r][c];
       System.out.println("Enter the element of the matrix : ");
       for(int i=0;i<mat.length;i++){
          for(int j=0;j<mat[0].length;j++)
          {
             mat[i][j]=sc.nextInt();
          }
       }
       System.out.println("The matrix is : ");
       for(int i=0;i<mat.length;i++){
          for(int j=0;j<mat[0].length;j++)
          {
             System.out.print(mat[i][j]+" ");
          }
         System.out.println();
       }

       MatrixFun m=new MatrixFun(mat);
       TransNorm t=new TransNorm();
       
       DataKeeperFun d=t.getTransNorm(m);

       System.out.println("The norm is : "+d.norm);
        System.out.println("The trans is : "+d.trans);

    }
}
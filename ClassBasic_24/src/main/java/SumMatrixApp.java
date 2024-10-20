
import java.util.Scanner;


public class SumMatrixApp {
//    Write a program to find the sum of  a matrix elements. Declare matrix as the data 
//member of the class. Assign the matrix using the method getData and find the sum using 
//a member function called getsum to return the sum to the main class.
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of row : ");
        int r=sc.nextInt();
        System.out.println("Enter the size of column : ");
        int c=sc.nextInt();
        
        int mat[][]=new int[r][c];
        
        Matrix m=new Matrix();
       
        m.getElement(mat);
        m.printf(mat);
        
        MatrixSum sm=new MatrixSum();
         sm.getData(mat);
        int Sum=sm.getSum();
        System.out.println("The sum is : "+Sum);
    }
}

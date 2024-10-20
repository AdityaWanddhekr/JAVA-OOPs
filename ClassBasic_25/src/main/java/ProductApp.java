
import java.util.Scanner;


public class ProductApp {
        // Write a program to find the Multiplication of two matrices. Declare two matrices as the 
       // data member of the class. Assign a matrix using the method getData  and another using 
      // object. And then find the Multiplication of two matrices through a  member function 
     // called getProduct to return the Product matrix to the main class.
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row1 size : ");
        int r1=sc.nextInt();
        System.out.println("Enter the column1 size : ");
        int c1=sc.nextInt();
        
        System.out.println("Enter the row2 size : ");
        int r2=sc.nextInt();
        System.out.println("Enter the column2 size : ");
        int c2=sc.nextInt();
        
        int mat1[][]=new int[r1][c1];
        
        Matrix m=new Matrix();
        m.getElement(mat1);
        
        int mat2[][]=new int[r2][c2];
        
        
        Product p=new Product();
        p.getData(mat1);
        p.m2=mat2;
        
        m.getElement(mat2);
        m.printf(mat1);
        m.printf(mat2);
        
        int prod[][]=p.getProduct(mat1, mat2);
        m.printf(prod);
        
    }
}

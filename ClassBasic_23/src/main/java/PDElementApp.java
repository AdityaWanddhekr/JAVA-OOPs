
import java.util.Scanner;


public class PDElementApp {
//    Write a program to find the principal diagonal Elements of a matrix. Declare a matrix as 
//the data member of the class. Assign the matrix using the objects and the class contains a 
//single method and returns the Principal Diagonal elements in an array from the method. 
    
    public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the size of the row : ");
         int r=sc.nextInt();
         System.out.println("Enter the size of the column : ");
         int c=sc.nextInt();
         
         int mat[][]=new int[r][c];
         
         Matrix m=new Matrix();
         m.getData(mat);
         m.getElement(mat);
         m.printf(mat);
         
         PDElement pd=new PDElement();
         int PD[]=pd.getPDArray(mat);
         System.out.println("The principle diagonal elemnt are : ");
         for(int i=0;i<PD.length;i++){
             System.out.print(PD[i]+" ");
         }
               
    }
}


import java.util.Scanner;


public class Matrix {
    void getElement(int mat[][]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the matrix : ");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]=sc.nextInt();
            }
        }
    }
    
    void printf(int mat[][]){
        System.out.println("The matrix is : ");
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}

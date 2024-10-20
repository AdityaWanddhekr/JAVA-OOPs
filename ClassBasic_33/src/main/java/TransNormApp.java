
import java.util.Scanner;


public class TransNormApp {
//     WAP to find the trace and normal of a matrix through a class and access those values in the main 
//     function by returning both by embedding it into an object of another class.
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size row : ");
        int r=sc.nextInt();
        System.out.println("Enter the size column : ");
        int c=sc.nextInt();
        
        int a[][]=new int[r][c];
        
        System.out.println("Enter the element : ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("The matrix is : ");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        
        TransNorm t=new TransNorm();
        t.m=a;
        DataKeeper d=t.TransNorm();
        System.out.println("Trans = "+d.trans);
        System.out.println("Trans = "+d.norm);

        
        
    }
}

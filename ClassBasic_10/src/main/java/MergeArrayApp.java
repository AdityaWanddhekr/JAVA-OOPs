
import java.util.Scanner;


public class MergeArrayApp {
//    Write a program to merge array one after another and as consecutively using two 
//    different methods in a class ( Pass the array as argument from main class and return 
//    the array).
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // Array 1.
        System.out.println("Enter the size of array a : ");
        int size1=sc.nextInt();
        int a[]=new int [size1];
        System.out.println("Enter the element of the array a : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        //Array 2.
        System.out.println("Enter the size of array b : ");
        int size2=sc.nextInt();
        int b[]=new int [size2];
        System.out.println("Enter the element of the array b : ");
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }
        
        Merge m=new Merge();
        int c[]=m.MergeArray(a, b);
        System.out.println("The consigatively merged array is : ");
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
}

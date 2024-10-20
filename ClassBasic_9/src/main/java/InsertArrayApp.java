
import java.util.Scanner;


public class InsertArrayApp {
    
//    Write a program to insert an element in the  array using one function in the class ( 
//    Pass the array as argument from main class and return the array). 
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size=sc.nextInt();
        
        int a[]=new int[size+1];
        
        System.out.println("Enter the element of the array : ");
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        
        Insert I=new Insert();
        int IA[]=I.getArray(a, size);
        System.out.println("The array is : ");
        for(int i=0;i<IA.length;i++){
            System.out.println(IA[i]+" ");
        }
    }
}

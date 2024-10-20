
import java.util.Scanner;


public class ReverseApp {
    //.WAP to find the reverse of an array of object. 
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array object : ");
        int size=sc.nextInt();
        
        Reverse r[]=new Reverse[size];
        // create boject of every element.
        
        for(int i=0;i<r.length;i++){
            r[i]=new Reverse();
        }
        
        // get elements 
        System.out.println("Enter the element of the array : ");
        for(int i=0;i<r.length;i++){
            r[i].a=sc.nextInt();
        }
        System.out.println("The array is : ");
        for(int i=0;i<r.length;i++){
            System.out.print(r[i].a+" ");
        }
        
        
        System.out.println("The Reverse array is : ");
        r[0].getRev(r);
        for(int i=0;i<r.length;i++){
            System.out.print(r[i].a+" ");
        }
    }
}

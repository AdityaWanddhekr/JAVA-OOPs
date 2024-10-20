
import java.util.Scanner;


public class EvenArrayApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int size=sc.nextInt();
        
        int a[]=new int[size];
       
        System.out.println("Enter the element of the array : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        ArrayFunction AF=new ArrayFunction();
        System.out.println("The array is : ");
        AF.printf(a);
        
        Even E=new Even();
        int Even[]=E.getevenArray(a);
        System.out.println("The Even array is : ");
        AF.printf(Even);
                
    }
}

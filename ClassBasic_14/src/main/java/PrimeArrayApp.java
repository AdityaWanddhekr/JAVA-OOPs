
import java.util.Scanner;


public class PrimeArrayApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        
        int a[]=new int[size];
        
        System.out.println("Enter the elements : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        PrimeFunction pf=new PrimeFunction();
        System.out.println("The array is : ");
        pf.Printf(a);
        Prime p=new Prime();
        int prime[]=p.primeNumber(a);
        System.out.println("The Prime array is : ");
        pf.Printf(prime);
        
    }
}

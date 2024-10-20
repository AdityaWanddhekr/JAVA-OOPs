
import java.util.Scanner;


public class ArraySDApp {
//    Write a program to find mean and standard deviation of n numbers, using two different 
//methods like getMean and getSD( Pass the array as argument from main class).
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size : ");
        int size=sc.nextInt();
        
        int a[]=new int[size];
        
        System.out.println("Enter the element of the array : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        SD sd=new SD();
        double mean = sd.getMean(a);
        System.out.println("The mean is : "+mean);
        System.out.println("The SD is : "+sd.getSD(mean,a));
        
    }
}

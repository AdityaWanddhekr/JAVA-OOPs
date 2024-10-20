
import java.util.Scanner;

public class PrimeApp {
    //Write a program to check a given number is prime or not, assign the value to the data 
    //members using the objects. And the class is having one member function as isPrime. 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number=sc.nextInt();
        
        Prime p=new Prime();
        p.num=number;
        p.isPrime();
    }
}


import java.util.Scanner;

//Write a program to find the average of 3 integers using a class which contains three 
//Data members and 3 member functions like getData, findAverage and getAverage. 
public class AvarageApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b=sc.nextInt();
        System.out.println("Enter the value of c : ");
        int c=sc.nextInt();
        
        Avarage avg=new Avarage();
        avg.getData(a, b, c);
        avg.getAvg();
        System.out.println("The Avarage of three numbers are : "+avg.displayAvarage());
    }
}

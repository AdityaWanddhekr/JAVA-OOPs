
import java.util.Scanner;


public class ReverseApp {
    //Write a program to get the reverse of a number, Assign the value to the data members 
    //using the objects. And the class is having one member function as getReverse. 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int number=sc.nextInt();
        
        Reverse rev=new Reverse();
        rev.num=number;
        
        System.out.println("The reverse of the number is : "+rev.getReverse());
    }
}

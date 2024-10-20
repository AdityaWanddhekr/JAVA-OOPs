
import java.util.Scanner;


public class ArraySum {
    // sum of the array object elements.
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array object : ");
        int size =sc.nextInt();
        Sum s[]=new Sum[size];
        
        Array a=new Array();
        a.getElment(s);
        a.printf(s);
   
        int sum=s[0].getSum(s);
        System.out.println("The sum is : "+sum);
    }
}

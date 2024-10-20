
import java.util.Scanner;


public class FiboSumApp {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number : ");
         int num=sc.nextInt();
         
         FiboSum s=new FiboSum();
         int sum=s.getSum(num);
         System.out.println("The sum is : "+sum);
     }
}

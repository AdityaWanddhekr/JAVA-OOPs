
import java.util.Scanner;


public class ComplexSumApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the val 1 : ");
        int val1=sc.nextInt();
        System.out.println("Enter the val 2 : ");
        int val2=sc.nextInt();
        System.out.println("Enter the val 3 : ");
        int val3=sc.nextInt();
        System.out.println("Enter the val 4 : ");
        int val4=sc.nextInt();
        
        Complex c1=new Complex();
        c1.getData(val1, val2);
        Complex c2=new Complex();
        c2.getData(val3, val4);
        
        Complex sum=c1.getSum(c2);
        
        c1.display();
        c2.display();
        System.out.println("_________");
        sum.display();
        
        
    }
}

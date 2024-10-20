
import java.util.Scanner;


public class SumComplexApp {
//       WAP to print sum of two complex numbers by using object as argument (by returning 
//       object, Pass two objects as arguments).
    
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
        
        Sum s1=new Sum();
        s1.getData(val1, val2);
         Sum s2=new Sum();
        s2.getData(val3, val4);
        
        Sum sum=s1.getSum(s1, s2);
        sum.display(s1);
        sum.display(s2);

        System.out.println("The sum is : ");
        sum.display(sum);
        
    }
}

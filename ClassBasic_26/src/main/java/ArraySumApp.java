
import java.util.Scanner;


public class ArraySumApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array object : ");
        int size=sc.nextInt();
        Sum s[]=new Sum[size];
        // create object of each element
        for(int i=0;i<s.length;i++){
            s[i]=new Sum();
        }
        
        for(int i=0;i<s.length;i++){
            s[i].getData(i);
        }
        
        int Sum=s[0].getSum(s);
        System.out.println("The sum of array object is : "+Sum);
        
    }
}

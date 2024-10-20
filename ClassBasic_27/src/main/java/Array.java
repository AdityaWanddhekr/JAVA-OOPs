
import java.util.Scanner;


public class Array {
   
    void getElment(Sum s[]){
        Scanner sc=new Scanner(System.in);
        // cerate object of each element.
        for(int i=0;i<s.length;i++){
            s[i]=new Sum();
        }
        System.out.println("Enter the element : ");
        for(int i=0;i<s.length;i++){
            s[i].a=sc.nextInt();
        }
        
    }
    void printf(Sum s[]){
        System.out.println("The array is : ");
        for(int i=0;i<s.length;i++){
            System.out.print(s[i].a+" ");
        }
    }
}

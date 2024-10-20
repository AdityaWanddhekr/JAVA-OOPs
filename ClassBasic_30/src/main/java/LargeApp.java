
import java.util.Scanner;


public class LargeApp {
//    WAP to find the biggest percentage among given 5 student’s information like name, Roll no 
//and Percentage by using array as objects ( Create classes like Student, Biggest)
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array as object : ");
        int size=sc.nextInt();
        
        Student s[]=new Student[size];
        for(int i=0;i<s.length;i++){
            s[i]=new Student();
            s[i].getData(i);
        }
        
        System.out.println("The student data is : ");
        for(int i=0;i<s.length;i++){
            s[i].display();
        }
        
        Large l=new Large();
        double large=l.getLarge(s);
        System.out.println();
        System.out.println("The largest percentage is : "+large);
    }
}

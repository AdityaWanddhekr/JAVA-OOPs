
import java.util.Scanner;


public class SDApp {
   //Write a program to calculate the mean and standard deviation of 5 data members of class. 
   //Where assign the value to the 3 data members using the objects and 2 data members using a 
   //function called getData. And Then find the mean and standard deviation using another two 
   //methods like getMean and getSD.
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the all 5 values : ");
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        int x3=sc.nextInt();
        int x4=sc.nextInt();
        int x5=sc.nextInt();
        
        SD sd=new SD();
        sd.x1=x1;
        sd.x2=x2;
        sd.x3=x3;
        sd.getData(x4, x5);
        double mean=sd.getMean();
        System.out.println("The SD is : "+sd.getSD(mean));
    }
}

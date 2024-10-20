
import java.util.Scanner;


public class SDMeanApp {
//    WAP to find mean and standard Deviation  of an array in a function of a class and return both 
//by embedding it into an object of another class. 
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size=sc.nextInt();
        
        int a[]=new int[size];
        System.out.println("Enter the array element : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The array is : ");
        for(int i=0;i<a.length;i++){
           System.out.print(a[i]+" ");
        }
        
        SDMean sd=new SDMean();
        DataKeeper d=sd.SD(size, a);
        System.out.println("The mean is : "+d.mean);
        System.out.println("The SD is : "+d.SD);

        
    }
}

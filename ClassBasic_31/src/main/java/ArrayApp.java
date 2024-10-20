
import java.util.Scanner;


public class ArrayApp {
//    WAP to find biggest and smallest of an array in a function of a class and return both by 
//    embedding it into an object of another class.  
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int size=sc.nextInt();
        
        int a[]=new int[size];
        System.out.println("Enter the element of the array : ");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        
        System.out.println("The array is : ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        
        SmallLarge sl=new SmallLarge();
        sl.getData(a);
        DataKeeper d=sl.getSmallLarge();
        System.out.println("The large is : "+d.large);
        System.out.println("The small is : "+d.small);

    }
}

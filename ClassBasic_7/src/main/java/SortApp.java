
import java.util.Scanner;


public class SortApp {
//    Write a program to sort the array in ascending and descending order using two different 
//methods in the class (Pass the array as argument from main class and return the array). 
    
    public static void main(String[] args){
        
        int a[]={12,56,99,76,34,22};
        Sort sort=new Sort();
        int acc[]=sort.getAccending(a);
        System.out.println("The accending array is : ");
        for(int i=0;i<acc.length;i++){
           System.out.print(acc[i]+" ");
        }
        System.out.println();
        int dcc[]=sort.getDeccending(a);
        System.out.println("The Deccending array is : ");
        for(int i=0;i<dcc.length;i++){
           System.out.print(dcc[i]+" ");
        }
    }
}

import java.util.*;
public class ArraySumApp
{
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size of the array : ");
       int size=sc.nextInt();

       ArraySum as[]=new ArraySum[size];

       for(int i=0;i<as.length;i++){
           as[i]=new ArraySum();
           
       }
       int k=2;
       for(int i=0;i<as.length;i++){
           as[i].getData(k);           
       }
 
        int sum=as[0].getSum(as);
        System.out.println("The sum of array as object is : "+sum);
   }
}
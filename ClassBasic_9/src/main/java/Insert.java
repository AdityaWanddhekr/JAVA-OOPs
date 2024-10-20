
import java.util.Scanner;


public class Insert {
    
    int[] getArray(int a[],int size){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element to be insert : ");
        int ele=sc.nextInt();
        System.out.println("Enter the position to be insert : ");
        int posi=sc.nextInt();
       
        posi=posi-1;
        for(int i=size-1;i>=posi;i--){
            a[i+1]=a[i];
        }
        a[posi]=ele;
        return a;
    }
}


import java.util.Scanner;


public class SortApp {
//    .WAP to sort the student information in descending order based on Percentage of 5 given 
//students for the data members like name, roll no and percentage by using the array as objects ( 
//Create classes like Student , Sort)
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array object : ");
        int size=sc.nextInt();
        
        Array a[]=new Array[size];
        
        for(int i=0;i<a.length;i++){
            a[i]=new Array();
            a[i].getData(i);
        }
        
        System.out.println("Array before sort by percentage : ");
        for(int i=0;i<a.length;i++){
            a[i].diaplay();
        }
        
        Sort ss=new Sort();
        Array s[]=ss.getSort(a);
        System.out.println("Array After sort by percentage : ");
        for(int i=0;i<a.length;i++){
            s[i].diaplay();
        }
    }
}

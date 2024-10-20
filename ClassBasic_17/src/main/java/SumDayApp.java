
import java.util.Scanner;


public class SumDayApp {
//    WAP to find sum of two days entities which contains entities like years, months, weeks 
//    and days.
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year : ");
        int y1=sc.nextInt();
        System.out.println("Enter the month : ");
        int m1=sc.nextInt();
        System.out.println("Enter the week : ");
        int w1=sc.nextInt();
        System.out.println("Enter the day : ");
        int d1=sc.nextInt();
        
        System.out.println("Enter the year : ");
        int y2=sc.nextInt();
        System.out.println("Enter the month : ");
        int m2=sc.nextInt();
        System.out.println("Enter the week : ");
        int w2=sc.nextInt();
        System.out.println("Enter the day : ");
        int d2=sc.nextInt();
        
        
        Day D1=new Day();
        D1.getData(y1, m1, w1, d1);
        Day D2=new Day();
        D2.getData(y2, m2, w2, d2);
        
        Day sum=D1.getSum(D1, D2);
        
        D1.disPlay();
        D2.disPlay();
        System.out.println("____________");
        sum.disPlay();
        
    }
}

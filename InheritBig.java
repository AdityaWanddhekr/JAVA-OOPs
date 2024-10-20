import java.util.*;
public class InheritBig
{
    /* 
        WAP to find biggest of two numbers where one number
        is inherited from super class with its 
        data members. 
    */
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the A : ");
        int a=sc.nextInt();
        System.out.println("Enter the B : ");
        int b=sc.nextInt();

        Big big=new Big();
        big.getBig(a,b);
    }
}
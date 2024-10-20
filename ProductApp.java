import java.util.*;
public class ProductApp
{
    /*
       WAP to Create class name as Product as POJO with field id,
       name and price create array of object of     
       product of size 10 and find the product whose price is same.
    */
   public static void main(String[] args)
   {
       Scanner sc=new Scanner(System.in);
      
       System.out.println("Enter the size : ");
       int size=sc.nextInt();
 
       ProductInfo p[]=new ProductInfo[size];
       
       for(int i=0;i<p.length;i++)
       {
            p[i]=new ProductInfo();
  
            Scanner sc1=new Scanner(System.in);
            Scanner sc2=new Scanner(System.in);
            Scanner sc3=new Scanner(System.in);
 
            System.out.println("Enter the product info : "+(i+1));

            int id=sc1.nextInt();
            int price=sc2.nextInt();
            String name=sc3.nextLine();
   
            p[i].setId(id);
            p[i].setPrice(price);
            p[i].setName(name);

       }

       System.out.println("The student info is : ");
       for(int i=0;i<p.length;i++){
          System.out.println("Id = "+p[i].getId()+" Price = "+p[i].getPrice()+" Name = "+p[i].getName());
       }

       ProductFind pf=new ProductFind();
       pf.getSame(p);
   }
}
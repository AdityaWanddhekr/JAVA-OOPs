import java.util.*;
public class LibraryApp
{
    public static void main(String[] args)
    {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter the size : ");
          int size=sc.nextInt();

          BookInformation b[]=new BookInformation[size];
          for(int i=0;i<b.length;i++){
             b[i]=new BookInformation();
 
             Scanner sc1=new Scanner(System.in);
             Scanner sc2=new Scanner(System.in);
             Scanner sc3=new Scanner(System.in);
     
             System.out.println("Enter the Book Info : ");
             int id=sc1.nextInt();
             String name=sc2.nextLine();
             int price=sc3.nextInt();

             b[i].setId(id);
             b[i].setName(name);
             b[i].setPrice(price);

          }
     
          System.out.println("The book info is : ");
          for(int i=0;i<b.length;i++){
             System.out.println("Id = "+b[i].getId()+" Name = "+b[i].getName()+" Price = "+b[i].getPrice());
          }
    }
}
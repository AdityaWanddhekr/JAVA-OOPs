import java.util.*;

public class BookApp {
    /*
     * WAP to create POJO class name as Book with field id,name
     * and price and create 5 objects of book class using array of
     * objects and arrange all books in descending order by using its price.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();

        BookInfo BI[] = new BookInfo[size];

        for (int i = 0; i < BI.length; i++) {
            BI[i] = new BookInfo();

            Scanner sc1 = new Scanner(System.in);
            Scanner sc2 = new Scanner(System.in);
            Scanner sc3 = new Scanner(System.in);

            System.out.println("Enter the book info : " + (i + 1));

            int id = sc1.nextInt();
            String name = sc2.nextLine();
            int price = sc3.nextInt();

            BI[i].setId(id);
            BI[i].setName(name);
            BI[i].setPrice(price);

        }

        System.out.println("The book info before accending is ");
        for (int i = 0; i < BI.length; i++) {
            System.out
                    .println(" ID = " + BI[i].getId() + " Name = " + BI[i].getName() + " Price = " + BI[i].getPrice());
        }

        BookSort bs = new BookSort();
        BookInfo bi[] = bs.getSort(BI);

        System.out.println("The book info after accending is ");
        for (int i = 0; i < bi.length; i++) {
            System.out
                    .println(" ID = " + bi[i].getId() + " Name = " + bi[i].getName() + " Price = " + bi[i].getPrice());
        }

    }
}
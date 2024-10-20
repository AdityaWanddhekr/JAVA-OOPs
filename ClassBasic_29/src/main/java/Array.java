
import java.util.Scanner;


public class Array {
    int id;
    double per;
    String name;
    
    void getData(int i){
        Scanner sc1=new Scanner(System.in);
        Scanner sc2=new Scanner(System.in);
        Scanner sc3=new Scanner(System.in);

        System.out.println("Enter the id,percent and name of student : "+i+1);
         id=sc1.nextInt();
         per=sc2.nextDouble();
         name=sc3.nextLine();
    }
    
    void diaplay(){
        System.out.println("Id = "+id+"Per = "+per+" Name = "+name);
    }
}

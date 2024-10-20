import java.util.*;
public class StudentArrayInfo
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Enter the size of the array object : ");
         int size=sc.nextInt();

         
        
         StudentArray sa[]=new StudentArray[size];
         
         // create object of each element.
       
         for(int i=0;i<sa.length;i++)
         {
            sa[i]=new StudentArray();
         }

         // enter info of student.

         

         for(int i=0;i<sa.length;i++)
         {
              Scanner sc1=new Scanner(System.in);
              Scanner sc2=new Scanner(System.in);
              Scanner sc3=new Scanner(System.in);

              System.out.println("Enter the Student info : "+(i+1));
              int roll=sc1.nextInt();
              String name=sc2.nextLine();
              double per=sc3.nextDouble();
    
              sa[i].setRoll(roll);
              sa[i].setName(name);              
              sa[i].setPer(per);

              
         }

         System.out.println("The student array is : ");
         for(int i=0;i<sa.length;i++){
            System.out.println("Roll = "+sa[i].getRoll()+" Name = "+sa[i].getName()+" Percent = "+sa[i].getPer());
         }

    }
}
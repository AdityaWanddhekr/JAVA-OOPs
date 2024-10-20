import java.util.*;
public class StudentFindApp
{
    /*
       WAP to create POJO class name as Student with field
       id,name and per and create array of object student with size 5
       and input the id of student and search student record in student
       object array and if student then display student found otherwise 
       display message student not found.
    */
    public static void main(String[] args)
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the student : ");
        int size=sc.nextInt();

        StudentFindInfo SF[]=new StudentFindInfo[size];
 
        for(int i=0;i<SF.length;i++)
        {
           SF[i]=new StudentFindInfo();

           Scanner sc1=new Scanner(System.in);
           Scanner sc2=new Scanner(System.in);
           Scanner sc3=new Scanner(System.in);

           System.out.println("Enter the student info : "+(i+1));
  
           int id=sc1.nextInt();
           String name=sc2.nextLine();
           double per=sc3.nextDouble();
         
           SF[i].setId(id);
           SF[i].setName(name);
           SF[i].setPer(per);
        }

        for(int i=0;i<SF.length;i++)
        {
           System.out.println("Id = "+SF[i].getId()+" Name = "+SF[i].getName()+" Percent = "+SF[i].getPer());
        }

        StudentFind sf=new StudentFind();
        sf.getFind(SF);
        
       
    }
}
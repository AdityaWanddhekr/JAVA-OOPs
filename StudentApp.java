import java.util.*;
public class StudentApp
{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the size : ");
       int size=sc.nextInt();
      
        Student s[]=new Student[size];
 
        for(int i=0;i<s.length;i++){
           s[i]=new Student();
           s[i].getData(i);
        }
     

        System.out.println("The data before sorted by percentage : ");
        for(int i=0;i<s.length;i++){
            s[i].display();
        }

        Sort sort=new Sort();
        Student st[]=sort.getSort(s);

        System.out.println("The data after sorted by percentage : ");
        for(int i=0;i<st.length;i++){
            st[i].display();
        }
    }
}
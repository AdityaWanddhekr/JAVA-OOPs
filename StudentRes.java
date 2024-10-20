public class StudentRes
{ 
    int a[];
    double per;

     void studentMark(int s[])
     {
         a=s;
     }
  
     void calPercent()
     {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum+=a[i];
        }
        per=(sum/a.length);
     }

     void checkGrade()
     {
        if(per>=70 && per<=100)
        {
           System.out.println("The grade is A");
        }
        else if(per>=50 && per<70)
        {
           System.out.println("The grade is B");
        }
        else if(per<=40 && per<50)
        {
           System.out.println("The grade is C");
        }
        else if(per>=35 && per<40)
        {
           System.out.println("Pass");
        }
        else
        {
           System.out.println("Fail");
        }


     }

     
}
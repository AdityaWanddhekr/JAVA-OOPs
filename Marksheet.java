class Per
{  
   int p;
   void calPer(int a[]){
      int sum=0;
      for(int i=0;i<a.length;i++)
      {
         sum+=a[i];
      }
      p=sum/a.length;
   }
}

class Nine extends Per
{
   void show(){
       System.out.println("The percent of Nine is : "+p);
   }
}

class Eight extends Per
{
     void show()
     {
        System.out.println("The percent of Eight is : "+p);
     }
}

class Ten extends Per
{
    int p;
    void calPer(int a[]){
      int sum=0;
      for(int i=0;i<a.length-1;i++)
      {
         sum+=a[i];
      }
      p=sum/a.length-1;
   }
   
   void show(){
      System.out.println("The percent of Ten is : "+p);
   }
}
public class Marksheet
{
   public static void main(String[] args)
   { 
        int a[]={67,89,98,76,45,50};
        Eight e=new Eight();
        e.calPer(a);
        e.show();
        Nine n=new Nine();
        n.calPer(a);
        n.show();
        Ten t=new Ten();
        t.calPer(a);
        t.show();
   }
}
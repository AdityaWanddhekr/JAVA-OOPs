class SC
{   // 2) Create static refernce within same class with numll value.
    private static SC sc=null;
   // 1) declare class with private constructor.
   private SC()
   { 
      System.out.println("I am SingleTon constructor.");
   }
  
   // 3). Create one static method and return same class reference from it.

   static SC getInstance(){

        if(sc==null)
        {
           sc=new SC();
           System.out.println("Hash code of object "+System.identityHashCode(sc));
        }
      return sc;
   }

  
}
public class SingletonConstructor
{
     public static void main(String[] args)
     {
         SC sc1=new SC.getInstance();
         System.out.println("Hash code of object : "+System.identityHashCode(sc1));
     }
}
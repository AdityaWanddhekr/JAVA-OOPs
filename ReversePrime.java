public class ReversePrime
{
     /*
        WAP to find the reverse of a Data member belongs to Super class and 
        to check data  member  of Subclass ( Both are with the same name) as
        prime or not using Super keyword to call constructor and super keyword
        to access the Data member in Sub class.   
     */
     public static void main(String[] args)
     {
          Prime p=new Prime(27801,3);
          System.out.println(p.getReverse());
          if(p.getPrime()==true){
             System.out.println("The no is Prime!...");
          }
          else{
             System.out.println("The no not is Prime!..."); 
          }
     }
}
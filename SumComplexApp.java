public class SumComplexApp
{
    public static void main (String[] args)
    {
       ComplexSum c1=new ComplexSum();
       c1.getData(3,6);
       ComplexSum c2=new ComplexSum();
       c2.getData(2,5);
      
       ComplexSum c=c1.getSum(c1,c2);
     
       c1.display(c1);
       c2.display(c2);
       System.out.println("_______");
       c.display(c);
    }
}
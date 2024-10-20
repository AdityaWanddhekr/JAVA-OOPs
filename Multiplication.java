public class Multiplication
{
     public static void main(String[] args)
     {
          int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int b[][]={{9,8,7},{6,5,4},{3,2,1}};

         Matrix m=new Matrix();
         m.getData(a);
         m.b=b;

         Product p=new Product();
         int c[][]=p.getProduct(a,b);
         m.printf(c);
   
     }
}
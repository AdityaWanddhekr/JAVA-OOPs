public class Rectangle
{
   int l;
   int b;
   void getData(int l,int b)
   {
       this.l=l;
       this.b=b;
   }

    void showArea()
    {
       System.out.println("The area of rectangle is : "+l*b);
    }

}
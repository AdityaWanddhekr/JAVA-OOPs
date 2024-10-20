public class DistancePointApp
{
   /*
       WAP to calculate the Distance between two points(x,y) and also find 
       the position of the points(x,y) on x,y quadrant using four different 
       classes called One, Two, Three and Four.Class First has point x as 
       private data member and set the value of x using private member function
       and class Two has point y as private data member and set the value of y 
       using private member function. Now inherit the class Three from class Two
      and calculate the distance between two points(x1,y1)&(x2,y2) where points 
      (x1,y1) are the public data member of the class Three. 
       For class Four find the position on x,y quadrant by inheriting 
       class Two.(hint: Hybrid Inheritance)  
   */
   public static void main(String[] args)
   {
       Three_3 t=new Three_3();
       double dist=t.getDistance();
       System.out.println("The dist is : "+dist);
       Four_4 f=new Four_4();
       f.getPosition();
   }
}
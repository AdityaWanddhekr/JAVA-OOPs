public class DistanceApp
{ 
   public static void main(String[] args)
   {
      Point p1=new Point();
      p1.getData(2,5);
      Point p2=new Point();
      p2.getData(3,8);
     
      Distance d=new Distance();
      double dist=d.getDist(p1,p2);
      System.out.println("Distance is : "+dist);
   }
}

public class DistanceApp {
//    WAP to find the distance between two objects of a class called point when the class is 
//having default constructor, parameterized constructor and function called getDistance(). 
     public static void main(String[] args){
         Point p1=new Point();
         Point p2=new Point(10,20);
         double d=p1.getDiastance(p1, p2);
         System.out.println("Distance d = "+d);
     }
}

public class AvarageApp
{
     /*
      WAP to find average of 3 numbers where all the three numbers are
      derived from different class in multilevel inheritance using different
      input Function( Do not Overload the Funtions). 
     */
    public static void main(String[] args)
    {
        Point3 p=new Point3();
        p.getData1(10);
        p.getData2(20);
        p.getData3(30);
        double avg=p.getAvg();
        System.out.println("The avg is : "+avg);
    }
}
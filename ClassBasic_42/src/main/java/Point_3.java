
public class Point_3 {
    int a;
    Point_3(int a){
        this.a=a;
    }
    
    void getArea(Point_1 p1,Point_2 p2,Point_3 p3)
    {
        double s=(p1.a+p2.a+p3.a)/3;
        double area=Math.sqrt(s*(s-p1.a)*(s-p1.a)*(s-p1.a));
        System.out.println("The area is : "+area);
        
    }
}

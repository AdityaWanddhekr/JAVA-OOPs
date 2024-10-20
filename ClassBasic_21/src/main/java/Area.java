
public class Area {
    double getAraea(double a,double b,double c){
        double s=(a+b+c)/2;
        double val=s*(s-a)*(s-b)*(s-c);
        double area=Math.sqrt(val);
        
        return area;
    }
}


public class SD {
    int x1,x2,x3,x4,x5;
    void getData(int x4,int x5){
        this.x4=x4;
        this.x5=x5;
    }
    double getMean(){
        return (x1+x2+x3+x4+x5)/5;
    }
    double getSD(double mean){
        double val=Math.pow(mean-x1,2)+Math.pow(mean-x2,2)+Math.pow(mean-x3,2)+Math.pow(mean-x4,2)+Math.pow(mean-x5,2);
        double total=val/5;
        return Math.sqrt(total);
    }
}

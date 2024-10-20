
public class Sum {
    int real;
    int img;
    
    void getData(int x,int y){
        real=x;
        img=y;
    }
    
    Sum getSum(Sum s1,Sum s2){
        Sum sum=new Sum();
        sum.real=s1.real+s2.real;
        sum.img=s1.img+s2.img;
        return sum;
    }
    
    void display(Sum s){
        System.out.println(s.real+" +i"+s.img);
    }
}


public class Complex {
    int real;
    int img;
    
    void getData(int x,int y){
        real=x;
        img=y;
    }
    
    Complex getSum(Complex c1){
        Complex sum=new Complex();
        sum.real=c1.real+real;
        sum.img=c1.img+img;
        
        return sum;
    }
    
    void display(){
        System.out.println(real+"i+"+img);
    }
}

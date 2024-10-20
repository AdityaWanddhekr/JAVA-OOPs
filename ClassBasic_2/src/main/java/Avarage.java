
public class Avarage {
    
    int a,b,c,Avg;
    
    void getData(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    
    void getAvg(){
        this.Avg=(a+b+c)/3;
    }
    
    double displayAvarage(){
        return this.Avg;
    }
}

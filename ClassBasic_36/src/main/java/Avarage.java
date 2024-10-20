
public class Avarage {
     static double avarage(int a,int b){
        return (a+b)/2;
    }
    static double avarage(int a,int b,int c){
        return (a+b+c)/3;
    }
    static double avarage(int a,int b,int c,int d){
        return (a+b+c+d)/c;
    }
    static double avarage(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum/a.length;
    }
}

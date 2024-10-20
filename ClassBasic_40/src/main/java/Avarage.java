
public class Avarage {
    int a[];
    Avarage(int a[]){
        this.a=a;
    }
    
    double getAvarage(){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum/a.length;
    }
}

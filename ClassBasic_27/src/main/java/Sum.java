
public class Sum {
     int a;
    void getData(int a){
        this.a=a;
    }
    int getSum(Sum a[]){
       int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i].a;
        }
        return sum;
    }
}

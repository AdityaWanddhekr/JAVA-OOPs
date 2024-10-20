public class Sum {
    int a;
    void getData(int a){
        this.a=a;
    }
    
    int getSum(Sum s[]){
        int sum=0;
        for(int i=0;i<s.length;i++){
            sum+=s[i].a;
        }
        return sum;
    }
}

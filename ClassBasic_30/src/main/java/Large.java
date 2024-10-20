
public class Large {
    double getLarge(Student s[]){
        double big=Integer.MIN_VALUE;
        for(int i=0;i<s.length;i++){
            if(big<s[i].per){
                big=s[i].per;
            }
        }
        return big;
    }
}


public class Reverse {
    int num;
    
    int getReverse(){
        int rev=0;
        while(this.num>0){
            int last=this.num%10;
            rev=rev*10+last;
            this.num/=10;
        }
        return rev;
    }
}

public class Prime extends ReverseNum
{
    int no;
    Prime(int num,int no)
    {
        super(num);
        this.no=no;
    }

    int getReverse(){
        int rev=0;
        int n=super.num;
        while(n>0){
          int last=n%10;
          rev=rev*10+last;
          n/=10;
        }
     return rev;
    }
 
    boolean getPrime(){
        boolean isPrime=true;
        for(int i=2;i<no;i++){
           if(no%i==0){
               isPrime=false;
               break;
           }
        }
      return isPrime;
    }
}
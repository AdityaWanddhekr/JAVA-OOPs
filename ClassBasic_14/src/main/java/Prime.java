
public class Prime {
    int[] primeNumber(int a[]){
        int count=0;
        
        for(int i=0;i<a.length;i++){
            boolean isPrime=true;
            for(int j=2;j<a[i];j++){
            if(a[i]%i==0){
                isPrime=false;
                break;
            }
           }
             if(isPrime){
            count++;
           }
        }
       
        
        int prime[]=new int[count];
        
        int p=0;
       for(int i=0;i<a.length;i++){
            boolean isPrime=true;
            for(int j=2;j<a[i];j++){
            if(a[i]%i==0){
                isPrime=false;
                break;
            }
           }
             if(isPrime){
            prime[p++]=a[i];
           }
        }
       return prime;
        
    }
}

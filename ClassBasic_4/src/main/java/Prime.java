public class Prime {
    int num;
    
    void isPrime(){
        boolean isP=true;
        for(int i=2;i<this.num;i++){
            if(this.num%i==0){
               isP=false;
                break;
            }
           
        }
       if(isP){
           System.out.println("The number is Prime.");
       }
       else{
           System.out.println("The number is not prime.");
       }
        
    }
}

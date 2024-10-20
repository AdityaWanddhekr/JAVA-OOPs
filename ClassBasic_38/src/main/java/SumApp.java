
public class SumApp {
    public static void main(String[] args){
        Sum s=new Sum();
       
        int sum=s.getSum();
        System.out.println("Sum = "+sum);
        
        Sum s1=new Sum(3,6);
        int sum1=s1.getSum();
        System.out.println("Sum = "+sum1);
    }
}

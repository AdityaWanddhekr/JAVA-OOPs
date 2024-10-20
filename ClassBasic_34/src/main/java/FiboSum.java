
public class FiboSum {
    static int getSum(int n){
        int f1=-1;
        int f2=1;
        int i=0;
        int sum=0;
        while(i<=n){
            int f3=f1+f2;
            f1=f2;
            f2=f3;
            System.out.println(f3);
            sum+=f3;
            i++;
        }
        return sum;
    }
}

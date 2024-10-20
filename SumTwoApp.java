public class SumTwoApp
{
    public static void main(String[] args)
    {
        SumTwo s1=new SumTwo();
        s1.getData(1,2);

        SumTwo s=s1.getSum(s1);
        System.out.println("The sum is : "+s.show());        
    }
}
public class ComplexSum
{
    int real;
    int img;

    void getData(int real,int img)
    {
        this.real=real;
        this.img=img;
    }

    ComplexSum getSum(ComplexSum c1,ComplexSum c2)
    {
        ComplexSum csum=new ComplexSum();

        csum.real=c1.real+c2.real;
        csum.img=c1.img+c2.img;
  
        return csum;
    }

    void display(ComplexSum c)
    {
        System.out.println(real+" i"+img);
    }

}
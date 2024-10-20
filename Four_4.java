public class Four_4 extends Two_2
{
    void getPosition()
    {
       System.out.println((x1>0 && y1>0)?"Ist Qudrant":(x1>0 && y1<0)?"IIst Qudrant":(x1<0 && y1<0)?"IIIrd Qudrant":(x1<0 && y1>0)?"IVth Qudrant":"Origin");
    }
}
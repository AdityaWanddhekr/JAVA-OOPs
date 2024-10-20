public class Freq
{
    int a[];
    void getData(int a[])
    {
        this.a=a;
    }

    void getFreq()
    {
       int freq=1;
       int i=1;
      
       while(i<a.length) 
       {
          while(i<a.length && a[i]==a[i-1]) 
          {
             freq++;
             i++;
          }
          System.out.println("Freq of "+a[i-1]+" = "+freq);
          freq=1;
          i++;
       }
    }
}
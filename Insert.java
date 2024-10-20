public class Insert
{
    int a[];
    int posi;
    int size;
    int ele;
    void getData(int a[])
    {
       this.a=a;
    }

    void insertValue(){
       for(int i=size-1;i>=posi;i--)
       {
          a[i+1]=a[i];
       }
      a[posi]=ele;
    }
}
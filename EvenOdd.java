public class EvenOdd
{
    Data_keeper getOddEven(int a[]){
        int odd=0;
        int even=0;
        for(int i=0;i<a.length;i++)
        {
           if(a[i]%2==0){
              even++;
           }
           if(a[i]%2!=0)
           {
              odd++;
           }
        }
        int Even[]=new int[even];
        int Odd[]=new int[odd];
        int ei=0,oi=0;
        for(int i=0;i<a.length;i++)
        {
             if(a[i]%2==0){
                Even[ei++]=a[i];
             }
              if(a[i]%2!=0){
                Odd[oi++]=a[i];
             }

        }
        int k=0;
        int l=0;
        Data_keeper d=new Data_keeper();
        for(int i=0;i<Even.length;i++)
        {
           d.even_arr[k++]=Even[i];
        }      
        for(int i=0;i<Odd.length;i++)
        {
           d.odd_arr[l++]=Odd[i];
        }     

         
        return d;
    }
}
public class Binary
{
   int a;
 
   Binary[] getBinary(Binary b[])
   {
       for(int i=0;i<b.length;i++)
       {
        
          int pow=0;
          int bin=0;
          while(b[i].a>0)
          {
             int last=b[i].a%2;
             bin+=last*Math.pow(10,pow);
             b[i].a/=2;
             pow++;
          }
          b[i].a=bin;
       }
     return b;
   }
}
public class BookSort
{
      BookInfo[] getSort(BookInfo s[])
      {
          for(int i=0;i<s.length;i++)
          {
              for(int j=i+1;j<s.length;j++)
              {
                  int price1=s[i].price;
                  int price2=s[j].price;
                  if(price1<price2)
                  {
                      BookInfo temp=s[i];
                      s[i]=s[j];
                      s[j]=temp;
                  }
              }
          }
         return s;
      }
}
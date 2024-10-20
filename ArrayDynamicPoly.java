public class ArrayDynamicPoly
{
    public static void main(String[] args)
    {
         int a[]={10,20,30,40,50};
          System.out.println("The Original array is : ");
          for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
          }

         ArrayPoly ap=null;
         
         ap=new ArrayBinary();
         ap.getData(a);
         int bi[]=ap.arrayOperation();
         System.out.println("The Binary array is : ");
          for(int i=0;i<bi.length;i++){
            System.out.print(bi[i]+" ");
          }
        
         int b[]={10,20,30,40,50};

         ap=new ArrayReverse();
         ap.getData(b);
         int rev[]=ap.arrayOperation();
         System.out.println("The Reverse array is : ");
          for(int i=0;i<rev.length;i++){
            System.out.print(rev[i]+" ");
          }

    }
}
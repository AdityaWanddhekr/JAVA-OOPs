public class ProductFind
{
      void getSame(ProductInfo p[]){
         boolean isFound=true;
         for(int i=0;i<p.length;i++){
            for(int j=i+1;j<p.length;j++){
                int pro1=p[i].price;
                int pro2=p[j].price;
                if(pro1==pro2){
      
                    System.out.println("Same prices product : \nId = "+p[i].getId()+" Price = "+p[i].getPrice()+" Name = "+p[i].getName());

                }
             }
           /*if(isFound)
           {
              System.out.println("Id = "+p[i].getId()+" Price = "+p[i].getPrice()+" Name = "+p[i].getName());
           }
           else{
              System.out.println("The price not same");
           }*/

         }
      }
}
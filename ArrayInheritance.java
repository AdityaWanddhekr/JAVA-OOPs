public class ArrayInheritance
{
    /*
        WAP to create 5 classes which are having parameterized constructor
        and one data members inherit all the classes in multilevel manner 
        into 5th class. Add these 5 data members in integer array and send 
        this array to another class to get the unique element in array. 
    */
    public static void main(String[] args)
    {
        PointFive p=new PointFive(2,3,4,2,3);
        int a[]=p.getArray();
       
        System.out.println("The array is : ");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }

        Unique u=new Unique();
        int uq[]=u.getUnique(a);
     
        System.out.println();
        System.out.println("The Unique array is : ");
        for(int i=0;i<uq.length;i++)
        {
            System.out.print(uq[i]+" ");
        }

    }
}
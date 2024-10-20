import java.util.*;

class AreaCircle {

    double Area;

    public void assignValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius : ");
        int a = sc.nextInt();

        Area = 3.14 * (a * a);

        sc.close();
    }

    public void showData() {
        System.out.println("The Area of circle is : " + Area);
    }
}

public class Oop_2 {
    // Find Area of circle.
    public static void main(String[] args) {
        AreaCircle area = new AreaCircle();
        area.assignValue();
        area.showData();
    }
}

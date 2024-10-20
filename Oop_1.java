
class AreaCircle {
    int r;

    public void assignData(int a) {
        r = a;
    }

    public void showData() {
        System.out.println("The area of circle is : " + (r * r));
    }
}

public class Oop_1 {
    // Square of number.
    public static void main(String[] args) {
        AreaCircle s = new AreaCircle();
        s.assignData(10);
        s.showData();
    }
}

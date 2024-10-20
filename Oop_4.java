class Power_no {
    int a;
    int i;

    public void assignValue(int b, int j) {
        a = b;
        i = j;

    }

    public void show() {
        int p = 1;

        for (int i = 1; i <= i; i++) {
            p *= a;
        }
        System.out.println("Power is :  " +p);
    }
}

public class Oop_4 {

    // Find power of number.

    public static void main(String[] args) {
        Power_no p = new Power_no();
        p.assignValue(2, 3);
        p.show();
    }
}
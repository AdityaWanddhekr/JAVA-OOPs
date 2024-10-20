import java.util.Scanner;

class Factorial {
    int val;

    public void assignVal(int a) {
        val = a;
    }

    public void show() {
        int f = 1;
        for (int i = 1; i <= val; i++) {
            f *= i;
        }
        System.out.println("Fcatorial is : " + f);
    }
}

public class Oop_6 {
    // Factorial.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        Factorial f = new Factorial();
        f.assignVal(num);
        f.show();

        sc.close();
    }
}
import java.util.*;

class Perfect {
    int n;

    public void assignVal(int a) {
        n = a;
    }

    public void show() {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            System.out.println("The number is Perfect.");
        } else {
            System.out.println("The number is not Perfect.");
        }
    }
}

public class Oop_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        Perfect p = new Perfect();
        p.assignVal(num);
        p.show();

        sc.close();
    }
}
import java.util.*;

public class DeleteEmployee {
    Employee_INFO[] getDelete(Employee_INFO a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the emplyee id to be deleted : ");
        int id = sc.nextInt();

        int posi = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i].id == id) {
                posi = i;
            }
        }

        for (int i = posi; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        sc.close();
        return a;

    }
}
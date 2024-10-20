
class Table {
    int num;

    public void assignVal(int a) {
        num = a;
    }

    public void printTbale() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * num);
        }
    }
}

public class Oop_3 {

    // Print the Table of number.

    public static void main(String[] args) {
        Table t = new Table();
        t.assignVal(2);
        t.printTbale();
    }
}
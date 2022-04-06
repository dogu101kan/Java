import java.util.Scanner;

public class recursiveDesen {
    public static void main(String[] args) {

        desen(17);
    }

    static void desen(int num) {
        if (num <= 0) {
            System.out.print(num + " ");
            return;
        }

        System.out.print(num + " ");
        desen(num - 5);
        System.out.print(num + " ");
    }
}

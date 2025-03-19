
import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to the swapping Station");
            System.out.println("Enter Value for A:");
            int a = input.nextInt();
            System.out.println("Enter Value for B:");
            int b = input.nextInt();

            int x = a;
            a = b;
            b = x;

            System.out.println("Swapping Done . . .");
            System.out.println("Value of A is:" + a);
            System.out.println("Value of B is:" + b);
        }

    }
}
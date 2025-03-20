
import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome to Basic Arithmetic Calculator");
            System.out.println("Enter an Integer A:");
            int x = input.nextInt();
            System.out.println("Enter an Integer B:");
            int y = input.nextInt();

            System.out.println(x+y);
            System.out.println(x-y);
            System.out.println(x*y);
            System.out.println(x/y);
        }

    }
}

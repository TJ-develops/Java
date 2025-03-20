
import java.util.Scanner;

public class unary {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter any Integer:");
            int x = input.nextInt();

            int x1 = ++x ;
            System.out.println(x1);
        }
    }
}

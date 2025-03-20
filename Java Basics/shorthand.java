
import java.util.Scanner;

public interface shorthand {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            int x1 = 2;
        
            System.out.println("Enter an Integer: ");
            int x = input.nextInt();

            x *= x1;

            System.out.println(x);
        }
    }
}

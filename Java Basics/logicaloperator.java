
import java.util.Scanner;

public class logicaloperator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Welcome! Let's check if your password is strong and secure.");
            System.out.println("Enter Your Password:");
            String x = input.nextLine();
            
            if (x.length() >= 8){
                System.out.println("Strong Password!");
            }
        }
    }
}

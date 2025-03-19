
import java.util.Scanner;

public class add {
public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Enter a Number:");
        int firstnum = input.nextInt();
        System.out.println("Enter another Number:");
        int seconfnum = input.nextInt();
        int sum = firstnum + seconfnum;
        System.out.println("Sum of your numbers is " +sum);
    }
    }
}
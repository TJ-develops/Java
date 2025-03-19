
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        System.out.print("What's your name?");
        Scanner input = new Scanner(System.in);
String name = input.nextLine();
        System.out.println("Get a Life " + name);
        input.close();
    }
}

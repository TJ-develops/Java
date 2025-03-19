
import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name?");
String name = input.nextLine();
        System.out.println("Get a Life " + name);
        input.close();
    }
}

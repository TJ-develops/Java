
import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Check Your Eligibility for a Quota.");
                System.out.println("Enter your Age:");
                int x = input.nextInt();


            if(x >= 60){
                System.out.println("You are eligible for the senior citizen quota.");
            }

            else if(x >= 13){
                System.out.println("You are eligible for the general quota.");
            }

            else{
                System.out.println("You can get a seat under the children's quota.");
            }
        }
    }
}

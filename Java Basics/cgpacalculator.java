import java.util.Scanner;

public class cgpacalculator {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the number of subjects: ");
            int subjects = input.nextInt();
            
            double totalGradePoints = 0;
            double totalCredits = 0;

            for (int i = 1; i <= subjects; i++) {
                System.out.print("Enter grade points for subject " + i + ": ");
                double grade = input.nextDouble();  // Accept grade points (e.g., 9.0 for 'A' grade)
                
                System.out.print("Enter credit hours for subject " + i + ": ");
                double credits = input.nextDouble(); // Accept credit hours
                
                totalGradePoints += grade * credits; // Multiply grade points by credits
                totalCredits += credits;
            }

            double CGPA = totalGradePoints / totalCredits;
            System.out.printf("Your CGPA is: %.2f\n", CGPA);
        }
    }
}


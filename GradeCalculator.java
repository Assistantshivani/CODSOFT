import java.util.Scanner;

public class GradeCalculator {

    public static String gradeCalculator(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 80) {
            return "B";
        } else if (average >= 70) {
            return "C";
        } else if (average >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("            STUDENT GRADE CALCULATOR            ");
        System.out.println("------------------------------------------------");
        System.out.println();
        System.out.print("Enter the number of subjects: ");
        int numberOfSubjects = scanner.nextInt();
        System.out.println();

        double totalMarks = 0;
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter marks for subject " + (i + 1) + ": ");
            totalMarks += scanner.nextDouble();
        }

        double averagePercentage = totalMarks / numberOfSubjects;
        String grade = gradeCalculator(averagePercentage);
        System.out.println();

        System.out.println("------------------------------------------------");
        System.out.println("Total Marks        : " + totalMarks);
        System.out.println("Average Percentage : " + averagePercentage);
        System.out.println("Grade              : " + grade);
        System.out.println("------------------------------------------------");

        scanner.close();
    }
}

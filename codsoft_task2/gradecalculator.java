import java.util.Scanner;

public class gradecalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numofSubjects;
        double totalMarks = 0.0;

        System.out.println("Enter the number of subjects: ");
        numofSubjects = scanner.nextInt();

        for (int i = 1; i <= numofSubjects; i++) {
            System.out.println("Enter the marks for subject " + i + ": ");
            double marks = scanner.nextDouble();
            if(marks>=0 && marks<=100)
            totalMarks += marks;
            else{
            System.out.println("Invalid score entered.");
            }
        }

        double avg = (totalMarks / numofSubjects);
        String grade = calculate(avg);

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + avg + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static String calculate(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A";
        } else if (averagePercentage >= 80) {
            return "B";
        } else if (averagePercentage >= 70) {
            return "C";
        } else if (averagePercentage >= 60) {
            return "D";
        } else {
            return "F";
        }
    }
}


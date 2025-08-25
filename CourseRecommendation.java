import java.util.Scanner;

public class CourseRecommendation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- Course Recommendation System -----");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        try {
            System.out.print("Enter your 10th percentage: ");
            double marks10 = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter your 12th percentage: ");
            double marks12 = Double.parseDouble(scanner.nextLine());

            if (marks10 < 0 || marks10 > 100 || marks12 < 0 || marks12 > 100) {
                System.out.println("Please enter valid percentages between 0 and 100.");
                return;
            }

            double avg = (marks10 + marks12) / 2;
            String recommendation;

            if (avg >= 80) {
                recommendation = "Science (Engineering/Medical/Research)";
            } else if (avg >= 60) {
                recommendation = "Commerce (Business/Accounting/Economics)";
            } else {
                recommendation = "Arts (Humanities/Languages/History)";
            }

            System.out.println("\nHello " + name + "!");
            System.out.println("Based on your academic performance:");
            System.out.println("10th Marks: " + marks10 + "%");
            System.out.println("12th Marks: " + marks12 + "%");
            System.out.println("👉 Recommended Stream: " + recommendation);

        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numeric values for marks.");
        }

        scanner.close();
    }
}

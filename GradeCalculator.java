import java.util.*;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks: ");
            total += sc.nextInt();
        }

        double avg = total / n;

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);

        if (avg >= 90) System.out.println("Grade: A");
        else if (avg >= 75) System.out.println("Grade: B");
        else if (avg >= 50) System.out.println("Grade: C");
        else System.out.println("Grade: Fail");

        sc.close();
    }
}

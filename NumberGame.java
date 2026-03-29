import java.util.*;

class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1; // 1 to 100
        int guess = 0;
        int attempts = 0;

        System.out.println("Guess the number (1-100):");

        while (guess != number) {
            guess = sc.nextInt();
            attempts++;

            if (guess > number) {
                System.out.println("Too high!");
            } else if (guess < number) {
                System.out.println("Too low!");
            } else {
                System.out.println("Correct! Attempts: " + attempts);
            }
        }

        sc.close();
    }
}

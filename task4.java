import java.util.*;

class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double rate = 83.0; // USD to INR
        System.out.print("Enter USD: ");
        double usd = sc.nextDouble();

        double inr = usd * rate;
        System.out.println("INR: " + inr);

        sc.close();
    }
}
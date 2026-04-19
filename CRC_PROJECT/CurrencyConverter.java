 import java.util.Scanner;
 

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount in INR: ");
        double inr = sc.nextDouble();

        System.out.println("\nConvert to:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");
        System.out.print("Enter your choice: ");

        int choice = sc.nextInt();

        double result;

        switch (choice) {
            case 1:
                result = inr / 83.0;
                System.out.println("Converted amount in USD: " + result);
                break;

            case 2:
                result = inr / 90.0;
                System.out.println("Converted amount in EUR: " + result);
                break;

            case 3:
                result = inr / 105.0;
                System.out.println("Converted amount in GBP: " + result);
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

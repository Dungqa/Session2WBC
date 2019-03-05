import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;

        do {
            System.out.println("Menu.");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter celsius:");
                    celsius= input.nextDouble();
                    fahrenheit= celsiusToFahrenheit(celsius);
                    System.out.println("Fahrenheit: "+ fahrenheit);
                    break;
                case 2:
                    System.out.println("Enter fahrenheit:");
                    fahrenheit= input.nextDouble();
                    celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.println("Celsius: "+ celsius);

                    break;
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

}

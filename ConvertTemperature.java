import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int chon;
        do {
            System.out.println("Menu");
            System.out.println("1. Chuyen do F sang C");
            System.out.println("2. Chuyen do C sang F");
            System.out.println("0. Exit");
            System.out.println("Chon menu: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Nhap do C: ");
                    celsius = sc.nextDouble();
                    System.out.println("Do F la: " + celsiusToFahrenheit(celsius));
                    break;
                case 2:
                    System.out.println("Nhap do F: ");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Do C la: " + fahrenheitToCelsius(fahrenheit));
                    break;
                case 0:
                    System.exit(0);
            }
        } while (chon != 0);
    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}

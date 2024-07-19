import java.util.Scanner;

public class ConverterMileAndKilometer {
    private final static Double MILES_PER_INCH = 1.609344;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter kilometers per kilometer: ");
        double kilometersToMiles = input.nextDouble();
        print(convertKilometersToMiles(kilometersToMiles));

        System.out.print("Enter miles per inch: ");
        double milesToKilometers = input.nextDouble();
        print(convertMilesToKilometers(milesToKilometers));
    }

    private static Double convertMilesToKilometers(Double miles) {
        return miles / MILES_PER_INCH;
    }
    private static Double convertKilometersToMiles(Double kilometers) {
        return kilometers * MILES_PER_INCH;
    }

    private static void print(double value) {
        System.out.printf("result = %.2f \n", value);
    }

}


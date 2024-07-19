public class ConverterMileAndKilometer {
    private final static Double MILES_PER_INCH = 1.609344;

    public static void main(String[] args) {
        double kilometersToMiles = 100;
        print(convertKilometersToMiles(kilometersToMiles));

        double milesToKilometers = 13.56;
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


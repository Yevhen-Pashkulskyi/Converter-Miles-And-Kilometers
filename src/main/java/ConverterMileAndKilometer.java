public class ConverterMileAndKilometer {
    private final static Double MILES_PER_INCH = 1.609344;

    public static void main(String[] args) {

    }

    private static Double convertMilesToKilometers(Double miles) {
        return miles / MILES_PER_INCH;
    }
    private static Double convertKilometersToMiles(Double kilometers) {
        return kilometers * MILES_PER_INCH;
    }

    private static void print(double value) {
        System.out.println(value + " " + MILES_PER_INCH);
    }

}


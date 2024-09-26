/**
 * double
 * Size: 64 bits
 * Range: Approximately ±1.7e308 (with 15 decimal digits of precision)
 * Usage: Suitable for precision calculations, such as scientific computations or financial data.
 */
public class DoubleExample {
    public static void main(String[] args) {
        // Storing a double value
        double myDouble = 123456.789;
        System.out.println("Double value: " + myDouble);

        // Maximum and minimum values
        double minValue = Double.MIN_VALUE; // 4.9E-324
        double maxValue = Double.MAX_VALUE; // 1.7976931348623157E308
        System.out.println("Double min value: " + minValue);
        System.out.println("Double max value: " + maxValue);

        // Usage example: Calculating compound interest
        double principal = 5000.0;
        double rate = 0.05;
        int years = 10;
        double compoundInterest = principal * Math.pow((1 + rate), years);
        System.out.println("Compound Interest: $" + compoundInterest);
    }
}

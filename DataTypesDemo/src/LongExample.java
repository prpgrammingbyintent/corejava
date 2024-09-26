/**
 * long
 * Size: 64 bits
 * Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 * Usage: Used for large integers, such as timestamps, unique IDs, or financial calculations.
 */

public class LongExample {
    public static void main(String[] args) {
        // Storing a long value
        long myLong = 10000000000L; // 'L' suffix indicates a long literal
        System.out.println("Long value: " + myLong);

        // Minimum and maximum values
        long minValue = Long.MIN_VALUE; // -9,223,372,036,854,775,808
        long maxValue = Long.MAX_VALUE; // 9,223,372,036,854,775,807
        System.out.println("Long min value: " + minValue);
        System.out.println("Long max value: " + maxValue);

        // Usage example: Timestamp (milliseconds since January 1, 1970)
        long timestamp = System.currentTimeMillis();
        System.out.println("Current timestamp: " + timestamp);
    }
}

/**
 * float
 * Size: 32 bits
 * Range: Approximately ±3.4e38 (with 7 decimal digits of precision)
 * Usage: Suitable for saving memory in large arrays of floating-point numbers, such as in 3D graphics.
 */
public class FloatExample {
    public static void main(String[] args) {
        // Storing a floating-point value
        float myFloat = 123.45f; // 'f' suffix indicates a float literal
        System.out.println("Float value: " + myFloat);

        // Maximum and minimum values
        float minValue = Float.MIN_VALUE; // 1.4E-45 (smallest positive float)
        float maxValue = Float.MAX_VALUE; // 3.4028235E38 (largest float)
        System.out.println("Float min value: " + minValue);
        System.out.println("Float max value: " + maxValue);

        // Usage example: Product weight
        float productWeight = 15.75f;
        System.out.println("Product weight: " + productWeight + " kg");
    }
}

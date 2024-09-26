/**
 * short
 * Size: 16 bits
 * Range: -32,768 to 32,767
 * Usage: Often used to store numbers where int is too large, such as in mobile applications or embedded systems.
 */
public class ShortExample {
    public static void main(String[] args) {
        // Storing a number
        short myShort = 15000;
        System.out.println("Short value: " + myShort);

        // Minimum and maximum values
        short minValue = Short.MIN_VALUE; // -32,768
        short maxValue = Short.MAX_VALUE; // 32,767
        System.out.println("Short min value: " + minValue);
        System.out.println("Short max value: " + maxValue);

        // Usage example: Sensor ID in an IoT system
        short sensorID = 12345;
        System.out.println("Sensor ID: " + sensorID);
    }
}

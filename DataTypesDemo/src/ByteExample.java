/**
 * byte
 * Size: 8 bits
 * Range: -128 to 127
 * Usage: Useful for saving memory in large arrays or when working with binary data streams, such as reading/writing files or network data.
 **/
public class ByteExample {
    public static void main(String[] args) {
        // Storing a small number
        byte smallNumber = 100;
        System.out.println("Byte value: " + smallNumber);

        // Storing a minimum value
        byte minValue = Byte.MIN_VALUE; // -128
        System.out.println("Byte min value: " + minValue);

        // Storing a maximum value
        byte maxValue = Byte.MAX_VALUE; // 127
        System.out.println("Byte max value: " + maxValue);

        // Usage example: Network packet header
        byte packetHeader = 64; // Byte-sized header in a protocol
        System.out.println("Packet header: " + packetHeader);
    }
}

public class DecodeExample {
    public static void main(String[] args) {
        Integer hex1 = Integer.decode("0xFF");    // 255
        Integer hex2 = Integer.decode("0x1A");    // 26

        Integer oct1 = Integer.decode("0123");    // 83
        Integer oct2 = Integer.decode("0777");    // 511

        System.out.println("0xFF = " + hex1);
        System.out.println("0x1A = " + hex2);
        System.out.println("0123 = " + oct1);
        System.out.println("0777 = " + oct2);
    }
}

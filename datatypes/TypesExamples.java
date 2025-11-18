public class TypesExamples {
    public static void main(String[] args) {

        System.out.println("целочисленные типы");

        byte byteValue = 100;
        byte byteZero = 0;
        System.out.println("byte: " + byteValue + ", zero: " + byteZero);

        short shortValue = 30000;
        short shortZero = 0;
        System.out.println("short: " + shortValue + ", zero: " + shortZero);

        int intValue = 2000000000;
        int intZero = 0;
        System.out.println("int: " + intValue + ", zero: " + intZero);

        long longValue = 9000000000000000000L;
        long longZero = 0L;
        System.out.println("long: " + longValue + ", zero: " + longZero);

        System.out.println("\nтипы с плавающей точкой");

        float floatValue = 3.14f;
        float floatZero = 0.0f;
        float floatPositiveInfinity = Float.POSITIVE_INFINITY;
        System.out.println("float: " + floatValue + ", zero: " + floatZero);

        double doubleValue = 2.718281828459045;
        double doubleZero = 0.0;
        double doubleNegativeInfinity = Double.NEGATIVE_INFINITY;
        System.out.println("double: " + doubleValue + ", zero: " + doubleZero);

        System.out.println("\nспециальные значения");

        System.out.println("float +Infinity: " + floatPositiveInfinity);
        System.out.println("double -Infinity: " + doubleNegativeInfinity);
        System.out.println("is Finite: " + Double.isFinite(doubleValue));

        System.out.println("\nсимвольный тип");

        char charValue = 'A';
        char charZero = '\u0000';
        char charUnicode = '\u03A9';

        System.out.println("char: '" + charValue + "', zero: '" + charZero + "'");
        System.out.println("unicode char: " + charUnicode);

        System.out.println("\nбулевский тип");

        boolean booleanTrue = true;
        boolean booleanFalse = false;
        System.out.println("boolean true: " + booleanTrue + ", false: " + booleanFalse);

    }
}

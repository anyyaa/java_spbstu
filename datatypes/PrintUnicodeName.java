public class PrintUnicodeName {
    public static void main(String[] args) {
        char A = '\u0410';
        char n = '\u043D';
        char a = '\u0430';

        String name = "" + A + n + n + a;
        System.out.println("Моё имя: " + name);
        System.out.println("Имя в Unicode: " + "\u0410\u043D\u043D\u0430");

    }
}

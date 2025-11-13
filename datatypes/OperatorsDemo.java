public class OperatorsDemo {
    public static void main(String[] args) {

        int a = 10, b = 3;
        double x = 5.5, y = 2.0;
        boolean bool1 = true, bool2 = false;

        // = оператор присваивания
        int result = 0;
        System.out.println("= : result = " + result);

        // +=, -=, *=, /=, %=
        result += 5;  // result = result + 5
        System.out.println("+= : result += 5 -> " + result);

        result -= 2;  // result = result - 2
        System.out.println("-= : result -= 2 -> " + result);

        result *= 3;  // result = result * 3
        System.out.println("*= : result *= 3 -> " + result);

        result /= 4;  // result = result / 4
        System.out.println("/= : result /= 4 -> " + result);

        result %= 3;  // result = result % 3
        System.out.println("%= : result %= 3 -> " + result);

        // ?: тернарный оператор
        String message = (a > b) ? "a больше b" : "a меньше b";
        System.out.println("?: : " + message);

        // || логическое ИЛИ
        boolean orResult = bool1 || bool2;
        System.out.println("|| : true || false = " + orResult);

        // && логическое И
        boolean andResult = bool1 && bool2;
        System.out.println("&& : true && false = " + andResult);

        // | побитовое ИЛИ
        int bitOr = a | b;  // 10 | 3 = 1010 | 0011 = 1011 (11)
        System.out.println("| : 10 | 3 = " + bitOr);

        // ^ побитовое исключающее ИЛИ
        int bitXor = a ^ b;  // 10 ^ 3 = 1010 ^ 0011 = 1001 (9)
        System.out.println("^ : 10 ^ 3 = " + bitXor);

        // & побитовое И
        int bitAnd = a & b;  // 10 & 3 = 1010 & 0011 = 0010 (2)
        System.out.println("& : 10 & 3 = " + bitAnd);

        // ==, != сравнение
        System.out.println("== : 10 == 3 -> " + (a == b));
        System.out.println("!= : 10 != 3 -> " + (a != b));

        // >, >=, <, <= сравнение
        System.out.println("> : 10 > 3 -> " + (a > b));
        System.out.println(">= : 10 >= 3 -> " + (a >= b));
        System.out.println("< : 10 < 3 -> " + (a < b));
        System.out.println("<= : 10 <= 3 -> " + (a <= b));

        // >>, >>>, << побитовые сдвиги
        int shiftRight = a >> 1;
        System.out.println(">> : 10 >> 1 = " + shiftRight);

        int shiftLeft = a << 1;
        System.out.println("<< : 10 << 1 = " + shiftLeft);

        int unsignedShift = -10 >>> 1;
        System.out.println(">>> : -10 >>> 1 = " + unsignedShift);

        // +, - сложение и вычитание
        System.out.println("+ : 10 + 3 = " + (a + b));
        System.out.println("- : 10 - 3 = " + (a - b));

        // *, /, % умножение, деление, остаток
        System.out.println("* : 10 * 3 = " + (a * b));
        System.out.println("/ : 10 / 3 = " + (a / b));
        System.out.println("% : 10 % 3 = " + (a % b));

        // ++, -- инкремент и декремент
        int preIncrement = ++a;  // сначала увеличиваем, потом присваиваем
        System.out.println("++ (префикс): ++10 -> a = " + a + ", preIncrement = " + preIncrement);

        int postIncrement = a++;  // сначала присваиваем, потом увеличиваем
        System.out.println("++ (постфикс): 11++ -> a = " + a + ", postIncrement = " + postIncrement);

        int preDecrement = --a;  // сначала уменьшаем, потом присваиваем
        System.out.println("-- (префикс): --12 -> a = " + a + ", preDecrement = " + preDecrement);

        int postDecrement = a--;  // сначала присваиваем, потом уменьшаем
        System.out.println("-- (постфикс): 11-- -> a = " + a + ", postDecrement = " + postDecrement);

        // ~ побитовое НЕ
        int bitNot = ~a;  // ~10 = ~1010 = ...11110101 (-11)
        System.out.println("~ : ~10 = " + bitNot);

        // ! логическое НЕ
        boolean notResult = !bool1;
        System.out.println("! : !true = " + notResult);

        String str1 = "Hello";
        String str2 = "World";

        // + конкатенация строк
        String concat = str1 + " " + str2;
        System.out.println("+ : \"Hello\" + \" \" + \"World\" = " + concat);

        // += конкатенация с присваиванием
        str1 += " Java";
        System.out.println("+= : str1 += \" Java\" = " + str1);

        // == и != сравнение ссылок (не содержимого!)
        System.out.println("== : \"Hello\" == \"Hello\" -> " + ("Hello" == "Hello"));
        System.out.println("== : str1 == \"Hello Java\" -> " + (str1 == "Hello Java"));
        System.out.println("!= : \"A\" != \"B\" -> " + ("A" != "B"));

        // правильное сравнение строк через equals()
        System.out.println("equals(): str1.equals(\"Hello Java\") -> " + str1.equals("Hello Java"));
    }
}

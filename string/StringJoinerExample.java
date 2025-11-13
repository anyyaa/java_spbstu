import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // 1. простой с разделителем
        StringJoiner sj1 = new StringJoiner(", ");
        sj1.add("яблоко");
        sj1.add("банан");
        sj1.add("апельсин");
        System.out.println("1. фрукты: " + sj1.toString());

        // 2. с префиксом, суффиксом и разделителем
        StringJoiner sj2 = new StringJoiner(" | ", "[ ", " ]");
        sj2.add("понедельник");
        sj2.add("вторник");
        sj2.add("среда");
        System.out.println("2. дни недели: " + sj2.toString());

        // 3. использование length() для получения длины результата
        StringJoiner sj8 = new StringJoiner("-");
        sj8.add("2024");
        sj8.add("11");
        sj8.add("04");
        System.out.println("3. дата: " + sj8.toString());
        System.out.println("3. длина строки: " + sj8.length());

    }
}

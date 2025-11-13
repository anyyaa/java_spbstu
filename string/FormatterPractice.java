import java.util.Formatter;
import java.util.Date;

public class FormatterPractice {
    public static void main(String[] args) {

        Formatter fmt = new Formatter();

        // %s - строковое представление
        fmt.format("имя: %s, ", "анна");

        // %d - десятичное целое
        fmt.format("возраст: %d лет, ", 25);

        // %f - число с плавающей точкой
        fmt.format("рост: %.2f м, ", 1.75);

        // %b - логическое значение
        fmt.format("студент: %b, ", true);

        // %c - символьное представление
        fmt.format("оценка: %c", 'A');

        System.out.println(fmt.toString());
        fmt.close();


        // практика #3 - спецификаторы даты и времени

        Date now = new Date();
        Formatter dateFmt = new Formatter();

        // %tY - год в четырехзначном формате
        dateFmt.format("год: %tY, ", now);

        // %tB - полное название месяца
        dateFmt.format("месяц: %tB, ", now);

        // %tA - полное название дня недели
        dateFmt.format("день недели: %tA, ", now);

        // %tH:%tM - часы и минуты
        dateFmt.format("время: %tH:%tM, ", now, now);

        // %td - день месяца
        dateFmt.format("число: %td", now);

        System.out.println(dateFmt.toString());
        dateFmt.close();

    }
}

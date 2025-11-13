/**
 * Класс для выполнения базовых арифметических операций.
 *
 * @author Anna Iatmanova
 * @version 1.0
 * @since 2025
 */
public class Calculator {

    /**
     * Текущий результат вычислений.
     */
    private double result;

    /**
     * Конструктор по умолчанию. Инициализирует результат нулём.
     */
    public Calculator() {
        this.result = 0;
    }

    /**
     * Складывает два числа и сохраняет результат.
     *
     * @param a первое слагаемое
     * @param b второе слагаемое
     * @return текущий результат после сложения
     */
    public double add(double a, double b) {
        result = a + b;
        return result;
    }

    /**
     * Умножает два числа и сохраняет результат.
     *
     * @param a первый множитель
     * @param b второй множитель
     * @return текущий результат после умножения
     */
    public double multiply(double a, double b) {
        result = a * b;
        return result;
    }

    /**
     * Возвращает текущий результат.
     *
     * @return текущее значение результата
     */
    public double getResult() {
        return result;
    }

    /**
     * Сбрасывает результат вычислений к нулю.
     */
    public void reset() {
        result = 0;
    }

    /**
     * Основной метод для демонстрации работы калькулятора.
     *
     * @param args аргументы командной строки (не используются)
     * @see #add(double, double)
     * @see #multiply(double, double)
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Демонстрация сложения
        double sum = calc.add(5, 3);
        System.out.println("5 + 3 = " + sum);

        // Демонстрация умножения
        double product = calc.multiply(4, 2.5);
        System.out.println("4 * 2.5 = " + product);

        // Получение текущего результата
        System.out.println("Текущий результат: " + calc.getResult());
    }
}

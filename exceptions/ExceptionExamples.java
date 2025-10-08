public class ExceptionExamples {
    public static void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("возраст должен быть от 0 до 150");
        }
        System.out.println("возраст установлен: " + age);
    }

    public static void main(String[] args) {
        System.out.println("ArithmeticException:");
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.println("результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ошибка деление на 0");
        }

        System.out.println("\nArrayIndexOutOfBoundsException:");
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("элемент массива: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ошибка. выход за границы массива");
        }

        System.out.println("\nIllegalArgumentException:");
        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        System.out.println("\nClassCastException:");
        try {
            Object text = "строка";
            Integer number = (Integer) text;
            System.out.println("число: " + number);
        } catch (ClassCastException e) {
            System.out.println("ошибка. неверное приведение типов");
        }

        System.out.println("\nNullPointerException:");
        try {
            String name = null;
            System.out.println("длина строки: " + name.length());
        } catch (NullPointerException e) {
            System.out.println("ошибка. обращение к null объекту");
        }

    }
}

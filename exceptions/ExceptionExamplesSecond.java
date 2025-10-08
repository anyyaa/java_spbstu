
class Ex1 extends Exception {
    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String message) {
        super(message);
    }
}

class ValidationException extends Exception {
    public ValidationException(String message) {
        super(message);
    }
}

class CalculationException extends Exception {
    public CalculationException(String message) {
        super(message);
    }
}

public class ExceptionExamplesSecond {

    // независимые исключения
    public static void processData(String input) {
        try {
            if (input == null) {
                throw new NullPointerException("строка null");
            }
            if (input.length() < 3) {
                throw new ValidationException("короткая строка");
            }
            int number = Integer.parseInt(input);
            if (number > 100) {
                throw new CalculationException("слишком большое");
            }
            System.out.println(number);

        } catch (NullPointerException | ValidationException | CalculationException e) {

            System.out.println("ошибка обработки: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("ошибка формата числа: " + e.getMessage());
        }
    }

    // с иерархией - обрабатываются отдельными catch
    public static void testHierarchy(int value) throws Ex1 {
        if (value == 1) {
            throw new Ex1("базовое Ex1");
        } else if (value == 2) {
            throw new Ex2("производное Ex2");
        } else if (value == 3) {
            throw new Ex3("второе производное Ex3");
        }
    }

    public static void main(String[] args) {
        // обработка независимых исключений

        processData(null);
        processData("ab");
        processData("150");
        processData("abc");
        processData("50");


        // обработка с учетом иерархии
        try {
            testHierarchy(3); // Ex3
        } catch (Ex3 e) {
            System.out.println("Ex3: " + e.getMessage());
        } catch (Ex2 e) {
            System.out.println("Ex2: " + e.getMessage());
        } catch (Ex1 e) {
            System.out.println("Ex1: " + e.getMessage());
        }

        try {
            testHierarchy(2);
        } catch (Ex1 e) {
            System.out.println("Ex1: " + e.getMessage() + " (" + e.getClass().getSimpleName() + ")");
        }

        // закомментировано тк будет ошибка:
        /*
        try {
            testHierarchy(1);
        } catch (Ex2 | Ex1 e) {
            System.out.println("это не скомпилируется");
        }
        */
    }
}

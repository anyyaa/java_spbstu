public class ExceptionHandling {

    public static void methodWithThrows() throws IllegalArgumentException {
        throw new IllegalArgumentException("исключение");
    }

    public static void main(String[] args) {

        System.out.println("перехваченное исключение:");
        try {
            int result = 10 / 0;
            System.out.println("результат: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("неперехваченное исключение:");
        methodWithThrows(); 
        System.out.println("эта уже не выполнится");
    }
}

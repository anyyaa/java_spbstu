public class NullPointer {
    public static void main(String[] args) {
        // Boolean со значением null
        Boolean bool = null;
        try {
            boolean b = bool; // NullPointerException
            System.out.println("значение: " + b);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }
}


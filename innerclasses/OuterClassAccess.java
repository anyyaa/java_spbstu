public class OuterClassAccess {

    // поля внешнего класса с разными спецификаторами
    private String privateField = "Приватное поле";
    String defaultField = "Поле с доступом по умолчанию (package-private)";
    protected String protectedField = "Защищённое поле";
    public String publicField = "Публичное поле";

    // метод внешнего класса
    private void privateMethod() {
        System.out.println("Вызван приватный метод внешнего класса");
    }

    public void publicMethod() {
        System.out.println("Вызван публичный метод внешнего класса");
    }

    // внутренний класс
    public class InnerClass {
        public void showAccess() {
            // внутренний класс имеет доступ ко всем полям и методам внешнего класса, в тч private
            System.out.println("Доступ к private: " + privateField);
            System.out.println("Доступ к default: " + defaultField);
            System.out.println("Доступ к protected: " + protectedField);
            System.out.println("Доступ к public: " + publicField);

            // вызов методов внешнего класса
            privateMethod();
            publicMethod();
        }
    }

    public static void main(String[] args) {
        OuterClassAccess outer = new OuterClassAccess();
        OuterClassAccess.InnerClass inner = outer.new InnerClass();
        inner.showAccess();
    }
}

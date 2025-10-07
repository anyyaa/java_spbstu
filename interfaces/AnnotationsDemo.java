public class AnnotationsDemo {

    static class Parent {
        void sayHello() {
            System.out.println("Hello from Parent");
        }

        // показывает, что метод устарел и не должен использоваться. будет показываться предупреждение об этом
        @Deprecated
        void oldMethod() {
            System.out.println("This method is deprecated and should not be used.");
        }
    }

    static class Child extends Parent {

        // показывает, что метод переопределён из родителя
        @Override
        void sayHello() {
            System.out.println("Hello from Child (overridden method)");
        }

        // используем устаревший метод родителя
        @SuppressWarnings("deprecation")
        void useOldMethod() {
            oldMethod(); // предупреждение подавлено
        }
    }

    public static void main(String[] args) {
        Child c = new Child();

        c.sayHello();       // демонстрация @Override
        c.useOldMethod();   // демонстрация @SuppressWarnings + @Deprecated
    }
}

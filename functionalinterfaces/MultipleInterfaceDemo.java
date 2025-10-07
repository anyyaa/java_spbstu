interface InterfaceA {
    default void greet() {
        System.out.println("Hello from InterfaceA");
    }
}

interface InterfaceB {
    default void greet() {
        System.out.println("Hello from InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {

    // переопределяем метод, чтобы разрешить конфликт
    @Override
    public void greet() {
        // можно вызвать конкретный метод интерфейса
        InterfaceA.super.greet(); // вызываем версию из InterfaceA
        InterfaceB.super.greet(); // вызываем версию из InterfaceB

        // можно написать свой вариант
        System.out.println("Hello from MyClass!");
    }
}

public class MultipleInterfaceDemo {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.greet();
    }
}

interface MyInterface {
    // неабстрактный метод (default)
    default void greet() {
        System.out.println("Hello from default method!");
    }

    // статический метод интерфейса
    static void staticGreet() {
        System.out.println("Hello from static method!");
    }
}

// класс, реализующий интерфейс
class MyClass implements MyInterface {

    // можно переопределить default-метод
    @Override
    public void greet() {
        System.out.println("Hello from overridden method in MyClass!");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // вызов статического метода интерфейса через имя интерфейса
        MyInterface.staticGreet();

        // создание объекта класса, реализующего интерфейс
        MyClass obj = new MyClass();

        // вызов переопределённого default метода через объект
        obj.greet();

        MyInterface ref = obj;
        ref.greet();
    }
}

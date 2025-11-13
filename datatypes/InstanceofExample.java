class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}
class Bird {}

public class InstanceofExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        // проверка объекта и его класса
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal));
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog));
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal)); // наследование
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog)); // обратное не работает

        // проверка с интерфейсами
        String str = "Hello";
        System.out.println("str instanceof String: " + (str instanceof String));
        System.out.println("str instanceof Object: " + (str instanceof Object)); // все наследуют от Object

        System.out.println("\n=== instanceof с null ===");

        Animal nullAnimal = null;
        String nullString = null;

        // instanceof всегда возвращает false для null
        System.out.println("nullAnimal instanceof Animal: " + (nullAnimal instanceof Animal));
        System.out.println("nullString instanceof String: " + (nullString instanceof String));
        System.out.println("null instanceof Object: " + (null instanceof Object)); // тоже false

        System.out.println("\n=== практическое использование ===");

        // использование в условиях
        Animal unknownAnimal = new Dog();

        if (unknownAnimal instanceof Dog) {
            System.out.println("это собака!");
        } else if (unknownAnimal instanceof Cat) {
            System.out.println("это кошка!");
        } else {
            System.out.println("это неизвестное животное");
        }

        // безопасное приведение типов
        processAnimal(new Dog());
        processAnimal(new Cat());
        //processAnimal(new Bird());
        processAnimal(null);

        Object[] objects = { "текст", 123, new Dog(), null, new int[5] };

        for (Object obj : objects) {
            System.out.println("---");
            System.out.println("объект: " + obj);
            System.out.println("instanceof String: " + (obj instanceof String));
            System.out.println("instanceof Integer: " + (obj instanceof Integer));
            System.out.println("instanceof Dog: " + (obj instanceof Dog));
            System.out.println("instanceof Animal: " + (obj instanceof Animal));
            System.out.println("instanceof int[]: " + (obj instanceof int[]));
            System.out.println("instanceof Object: " + (obj instanceof Object));
        }
    }
    public static void processAnimal(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            System.out.println("обрабатываем собаку");
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            System.out.println("обрабатываем кошку");
        } else if (animal == null) {
            System.out.println("передан null объект");
        } else {
            System.out.println("неизвестный тип животного");
        }
    }
}

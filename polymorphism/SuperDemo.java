class Parent {
    protected String name = "ParentName";

    public Parent() {
        System.out.println("Конструктор Parent вызван");
    }

    public void greet() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    protected String name = "ChildName";

    public Child() {
        super(); // вызов конструктора суперкласса
        System.out.println("Конструктор Child вызван");
    }

    public void greet() {
        super.greet(); // вызов метода суперкласса
        System.out.println("Child");
    }

    public void showNames() {
        System.out.println("Имя в Child: " + name);
        System.out.println("Имя в Parent через super: " + super.name); // доступ к полю суперкласса
    }
}

public class SuperDemo {
    public static void main(String[] args) {
        Child child = new Child();

        child.greet();
        child.showNames();
    }
}

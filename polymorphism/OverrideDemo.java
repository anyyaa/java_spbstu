class Animal {
    public String makeSound() {
        return "Some sound";
    }
}

class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Bark";
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Animal a = new Dog();
        System.out.println(a.makeSound());
    }
}

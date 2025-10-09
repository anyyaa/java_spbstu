import java.util.*;

class Animal {
    void makeSound() {
        System.out.println("Some sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

public class GenericsExample {

    // <? extends T> — можно только читать
    static void makeAllSounds(List<? extends Animal> animals) {
        for (Animal a : animals) {
            a.makeSound();  // можно вызывать методы Animal
        }
        // animals.add(new Dog()); нельзя добавлять
    }

    // <? super T> можно только записывать
    static void addDogs(List<? super Dog> dogs) {
        dogs.add(new Dog()); // можно добавлять Dog
        // Dog d = dogs.get(0); нельзя читать как Dog
    }

    public static void main(String[] args) {
        List<Dog> dogList = new ArrayList<>();
        List<Animal> animalList = new ArrayList<>();

        makeAllSounds(dogList);   // можно, Dog наследует Animal
        addDogs(animalList);      // можно, Animal это супертип Dog
    }
}

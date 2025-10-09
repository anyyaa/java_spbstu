final class Animal {
    public void makeSound() {
        System.out.println("Животное издает звук");
    }
}

// ошибка компиляции
// class Dog extends Animal {  
//     public void makeSound() {
//         System.out.println("лай");
//     }
// }

public class FinalClassDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // так работает нормаьлно
    }
}

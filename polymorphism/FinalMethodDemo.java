class Parent {
    public final void showMessage() {
        System.out.println("Сообщение из родительского класса");
    }
}
class Child extends Parent {
    // нельзя переопределить final-метод
    // @Override
    // public void showMessage() {
    //     System.out.println("Попытка переопределения — ошибка!");
    // }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Child child = new Child();
        child.showMessage(); 
    }
}

class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class InstanceofDemo {
    public static void main(String[] args) {
        Wrapper<Integer> intWrapper = new Wrapper<>(10);
        Wrapper<String> stringWrapper = new Wrapper<>("Hello");

        // будет ошибка тк нельзя проверить конкретный параметр типа
        // if (intWrapper instanceof Wrapper<Integer>)

        // можно проверять 
        if (intWrapper instanceof Wrapper) {
            System.out.println("intWrapper экземпляр Wrapper");
        }

        if (stringWrapper instanceof Wrapper) {
            System.out.println("stringWrapper экземпляр Wrapper");
        }
    }
}

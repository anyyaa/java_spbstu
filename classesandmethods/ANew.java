public class ANew {

    // 1: инициализация при объявлении
    public final int a1 = 10;

    // 2: инициализация через конструктор
    public final int a2;

    // 3: инициализация в блоке инициализации
    public final int a3;

    // инициализация для a3
    {
        a3 = 30;
    }

    public ANew(int value) {
        a2 = value;
    }

    public static void main(String[] args) {
        ANew obj1 = new ANew(20);

        System.out.println(obj1.a1);
        System.out.println(obj1.a2);
        System.out.println(obj1.a3);
    }
}

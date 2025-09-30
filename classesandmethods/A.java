public class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {

        System.out.println("через имя класса:");
        A.printVars();
        System.out.println("напрямую внутри класса:");
        printVars();
        System.out.println("через объект:");
        A obj = new A();
        obj.printVars();
        System.out.println("изменим значения статических переменных через объект:");
        obj.a = 10;
        obj.b = 20;

        System.out.println("вызов через имя класса после изменений:");
        A.printVars();
    }
}

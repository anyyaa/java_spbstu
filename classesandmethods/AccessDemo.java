public class AccessDemo {
    public static void main(String[] args) {
        DemoAccess demo = new DemoAccess();

        // public доступен всегда
        System.out.println("Public: " + demo.publicVar);

        // protected и default доступны, так как класс в том же пакете
        System.out.println("Protected: " + demo.protectedVar);
        System.out.println("Default: " + demo.defaultVar);

        // private недоступен напрямую, закомментирован тк будет ошибка
        // System.out.println("Private: " + demo.privateVar);

        demo.printPrivate();
    }
}


class DemoAccess {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3;
    private int privateVar = 4;
    public void printPrivate() {
        System.out.println("Private: " + privateVar);
    }
}

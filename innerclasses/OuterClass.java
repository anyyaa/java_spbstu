public class OuterClass {

    // внутренний класс без спецификатора 
    class DefaultInner {
        void show() {
            System.out.println("Default inner class — доступен только в пределах пакета");
        }
    }

    // публичный внутренний класс
    public class PublicInner {
        void show() {
            System.out.println("Public inner class — доступен отовсюду через объект внешнего класса");
        }
    }

    // защищённый внутренний класс
    protected class ProtectedInner {
        void show() {
            System.out.println("Protected inner class — доступен в наследниках и в том же пакете");
        }
    }

    // приватный внутренний класс
    private class PrivateInner {
        void show() {
            System.out.println("Private inner class — доступен только внутри внешнего класса");
        }
    }

    // метод внешнего класса, демонстрирующий использование приватного внутреннего класса
    public void createPrivateInner() {
        PrivateInner inner = new PrivateInner();
        inner.show();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // вызов публичного внутреннего класса
        OuterClass.PublicInner publicInner = outer.new PublicInner();
        publicInner.show();

        // вызов внутреннего класса без спецификатора (в том же файле — работает)
        OuterClass.DefaultInner defaultInner = outer.new DefaultInner();
        defaultInner.show();

        // вызов защищённого внутреннего класса
        OuterClass.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.show();


        // OuterClass.PrivateInner privateInner = outer.new PrivateInner(); // закомментировано тк будет ошибка
        outer.createPrivateInner(); // доступ через метод внешнего класса
    }
}

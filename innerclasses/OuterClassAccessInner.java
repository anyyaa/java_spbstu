public class OuterClassAccessInner {

    // внутренний класс с разными спецификаторами доступа
    public class PublicInner {
        public String publicField = "публичное поле внутреннего класса";
        private String privateField = "приватное поле внутреннего класса";

        public void publicMethod() {
            System.out.println(" публичный метод внутреннего класса");
        }

        private void privateMethod() {
            System.out.println(" приватный метод внутреннего класса");
        }
    }

    // метод внешнего класса, который пробует получить доступ к внутреннему классу
    public void testAccess() {
        PublicInner inner = new PublicInner();

        // доступ к публичным членам возможен напрямую
        System.out.println(inner.publicField);
        inner.publicMethod();

        // закомментировано тк будет ошибка компиляции:
        // System.out.println(inner.privateField); 
        // inner.privateMethod(); 
    }

    public static void main(String[] args) {
        OuterClassAccessInner outer = new OuterClassAccessInner();
        outer.testAccess();
    }
}

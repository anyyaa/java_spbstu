public class BooleanCreation {
    public static void main(String[] args) {

        // 1. конструктор 
        Boolean bool1 = new Boolean(true);
        Boolean bool2 = new Boolean("true");

        // 2. valueOf() - основной способ
        Boolean bool3 = Boolean.valueOf(true);
        Boolean bool4 = Boolean.valueOf("true");
        Boolean bool5 = Boolean.valueOf("TRUE"); 
        Boolean bool6 = Boolean.valueOf("false");
        Boolean bool7 = Boolean.valueOf("anything"); // false для любой строки кроме "true"

        // 3. parseBoolean() - возвращает примитив boolean
        boolean prim1 = Boolean.parseBoolean("true");

        // 4. константы
        Boolean bool8 = Boolean.TRUE;

        // 5. автоупаковка (autoboxing)
        Boolean bool9 = true;

        System.out.println("new Boolean(true): " + bool1);
        System.out.println("new Boolean(\"true\"): " + bool2);
        
        System.out.println("Boolean.valueOf(true): " + bool3);
        System.out.println("Boolean.valueOf(\"true\"): " + bool4);
        System.out.println("Boolean.valueOf(\"TRUE\"): " + bool5);
        System.out.println("Boolean.valueOf(\"false\"): " + bool6);
        System.out.println("Boolean.valueOf(\"anything\"): " + bool7);
        
        System.out.println("Boolean.parseBoolean(\"true\"): " + prim1);
        
        System.out.println("Boolean.TRUE: " + bool8);
        
        System.out.println("autoboxing true: " + bool9);
        
    }
}

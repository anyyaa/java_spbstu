public class SwitchTypes {
    public static void main(String[] args) {
        
        // 1. целочисленные типы
        byte byteValue = 2;
        switch (byteValue) {
            case 1:
                System.out.println("byte case 1");
                break;
            case 2:
                System.out.println("byte case 2");
                break;
            default:
                System.out.println("byte default");
        }
        
        short shortValue = 100;
        switch (shortValue) {
            case 100:
                System.out.println("short case 100");
                break;
            case 200:
                System.out.println("short case 200");
                break;
        }
        
        int intValue = 5;
        switch (intValue) {
            case 1:
                System.out.println("int case 1");
                break;
            case 5:
                System.out.println("int case 5");
                break;
        }
        
        char charValue = 'A';
        switch (charValue) {
            case 'A':
                System.out.println("char case A");
                break;
            case 'B':
                System.out.println("char case B");
                break;
        }
        
        // 2. string
        String stringValue = "hello";
        switch (stringValue) {
            case "hello":
                System.out.println("string case hello");
                break;
            case "world":
                System.out.println("string case world");
                break;
        }
        
        // 3. енам
        Day day = Day.MONDAY;
        switch (day) {
            case MONDAY:
                System.out.println("enum case MONDAY");
                break;
            case TUESDAY:
                System.out.println("enum case TUESDAY");
                break;
        }
        
        // 4. оболочки
        Integer integerValue = 10;
        switch (integerValue) {
            case 10:
                System.out.println("Integer case 10");
                break;
            case 20:
                System.out.println("Integer case 20");
                break;
        }
        
        Character characterValue = 'X';
        switch (characterValue) {
            case 'X':
                System.out.println("Character case X");
                break;
            case 'Y':
                System.out.println("Character case Y");
                break;
        }
    }
    
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY
    }
}

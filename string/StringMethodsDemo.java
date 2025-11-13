public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = " Hello, Java World! ";
        String emptyText = "";
        String spacesText = "   ";
        String email = "user@example.com";
        String mixedCase = "HeLLo WoRLd";

        // 1. length() - возвращает длину строки
        System.out.println("1. длина строки: " + text.length());

        // 2. trim() - удаляет пробелы в начале и конце строки
        System.out.println("2. trim(): '" + text.trim() + "'");

        // 3. toUpperCase() - преобразует все символы в верхний регистр
        System.out.println("3. toUpperCase(): " + mixedCase.toUpperCase());

        // 4. toLowerCase() - преобразует все символы в нижний регистр
        System.out.println("4. toLowerCase(): " + mixedCase.toLowerCase());

        // 5. substring() - возвращает подстроку
        System.out.println("5. substring(7, 11): " + text.substring(7, 11));

        // 6. replace() - заменяет все вхождения символа/строки
        System.out.println("6. replace('l', 'L'): " + text.replace('l', 'L'));

        // 7. contains() - проверяет содержит ли строка подстроку
        System.out.println("7. contains('Java'): " + text.contains("Java"));

        // 8. isEmpty() - проверяет пустая ли строка
        System.out.println("8. isEmpty(): '" + emptyText + "' -> " + emptyText.isEmpty());

        // 9. isBlank() - проверяет состоит ли строка только из пробелов (Java 11+)
        System.out.println("9. isBlank(): '" + spacesText + "' -> " + spacesText.isBlank());

        // 10. split() - разделяет строку на массив по разделителю
        System.out.println("10. split('@'): ");
        String[] emailParts = email.split("@");
        for (String part : emailParts) {
            System.out.println("   " + part);
        }
        
    }
}

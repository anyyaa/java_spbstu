import java.io.*;

public class OutputStreamExample {

    public static void main(String[] args) {
        String filename = "test_output.txt";

        try (FileOutputStream fos = new FileOutputStream(filename)) {

            fos.write(104); // 'h' в ASCII
            fos.write(101); // 'e' в ASCII
            fos.write(108); // 'l' в ASCII
            fos.write(108); // 'l' в ASCII
            fos.write(111); // 'o' в ASCII
            System.out.println("записаны ASCII коды: 104, 101, 108, 108, 111");

            fos.write(10); 
            System.out.println("записан код 10 (\\n)");

            fos.write(49); // '1' в ASCII
            fos.write(50); // '2' в ASCII
            fos.write(51); // '3' в ASCII
            System.out.println("записаны числа как ASCII коды");


        } catch (IOException e) {
            System.out.println("ошибка: " + e.getMessage());
        }
        displayFileContent(filename);
    }

  
    private static void displayFileContent(String filename) {

        try (FileInputStream fis = new FileInputStream(filename)) {
            System.out.print("прочитанные байты: ");

            int byteData;
            while ((byteData = fis.read()) != -1) {
                // показываем байт как число и как символ
                System.out.print(byteData + "('" + (char)byteData + "') ");
            }
            System.out.println();

        } catch (IOException e) {
            System.out.println("ошибка при чтении файла: " + e.getMessage());
        }
    }
}

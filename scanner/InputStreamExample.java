import java.io.*;
import java.util.Arrays;

public class InputStreamExample {

    public static void main(String[] args) {

        createTestFile("test_input.txt");

        demonstrateReadMethods("test_input.txt");
    }

    private static void createTestFile(String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            String text = "Hello InputStream!";
            fos.write(text.getBytes());
            System.out.println("Создан файл: " + filename);
            System.out.println("Содержимое: " + text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void demonstrateReadMethods(String filename) {
        System.out.println("\n=== Демонстрация методов read() ===");


        try (FileInputStream fis = new FileInputStream(filename)) {

            // 1: read() - читает один байт
            System.out.println("\n1. Метод read() - чтение по одному байту:");
            int firstByte = fis.read();
            System.out.println("Первый байт: " + firstByte + " (символ: '" + (char)firstByte + "')");

            // 2: читает в массив байтов
            System.out.println("\n2. Метод read(byte[] buffer) - чтение в массив:");
            byte[] buffer = new byte[10];
            int bytesRead = fis.read(buffer);
            System.out.println("Прочитано байт: " + bytesRead);
            System.out.println("Содержимое буфера: " + new String(buffer, 0, bytesRead));

            // 3: чтение с указанием смещения
            System.out.println("\n3. Метод read(byte[] buffer, int offset, int length):");
            byte[] largeBuffer = new byte[20];
            int remainingBytes = fis.read(largeBuffer, 5, 10);
            System.out.println("байт: " + remainingBytes);
            System.out.println("буфер: " + Arrays.toString(largeBuffer));

        } catch (IOException e) {
            e.printStackTrace();
        }

        // чтение всего файла
        readEntireFile(filename);
    }

    private static void readEntireFile(String filename) {
        System.out.println("\n4. чтение всего файла с помощью read():");

        try (FileInputStream fis = new FileInputStream(filename)) {
            int byteData;
            System.out.print("содержимое файла: ");

            // read() возвращает -1 когда достигнут конец файла
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData);
            }
            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

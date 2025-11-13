public class StringBufferBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append() - добавляет строку в конец
        sb.append(" World");
        System.out.println("1. append(): " + sb.toString());

        // 2. reverse() - переворачивает строку
        sb.reverse();
        System.out.println("4. reverse(): " + sb.toString());
        sb.reverse(); // возвращаем обратно

        // 3. replace() - заменяет символы в диапазоне
        sb.replace(6, 11, "world");
        System.out.println("5. replace(): " + sb.toString());

        // 4. charAt() - возвращает символ по индексу
        System.out.println("6. charAt(0): " + sb.charAt(0));

        // 5. setCharAt() - устанавливает символ по индексу
        sb.setCharAt(0, 'h');
        System.out.println("7. setCharAt(): " + sb.toString());

        // 6. capacity() - возвращает текущую вместимость
        System.out.println("9. capacity(): " + sb.capacity());

        // 7. substring() - возвращает подстроку
        System.out.println("10. substring(0, 5): " + sb.substring(0, 5));

        StringBuffer buffer = new StringBuffer("Test");

        // 8. ensureCapacity() - гарантирует минимальную вместимость
        buffer.ensureCapacity(50);
        System.out.println("11. ensureCapacity(50): capacity = " + buffer.capacity());

        // 9. setLength() - устанавливает новую длину
        buffer.setLength(2);
        System.out.println("12. setLength(2): " + buffer.toString());

        // 10. indexOf() - поиск подстроки
        buffer.append(" example text");
        System.out.println("13. indexOf('example'): " + buffer.indexOf("example"));

    }
}

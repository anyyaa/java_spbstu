public class StringConversions {
    public static void main(String[] args) {

        // 1. String -> StringBuilder для модификации
        String immutableText = "Hello";
        StringBuilder mutableText = new StringBuilder(immutableText);
        mutableText.append(" World").append("!");
        String finalText = mutableText.toString();
        System.out.println("1. String -> StringBuilder -> String: " + finalText);

        // 2. взаимное преобразование StringBuilder <-> StringBuffer
        StringBuilder fastBuilder = new StringBuilder("Fast");
        StringBuffer safeBuffer = new StringBuffer(fastBuilder.toString());
        safeBuffer.append(" and Safe");
        StringBuilder backToFast = new StringBuilder(safeBuffer.toString());
        System.out.println("2. StringBuilder <-> StringBuffer: " + backToFast.toString());
    }
}

import java.io.*;
import java.util.*;

public class HuffmanCoding {

    static class Node implements Comparable<Node> {
        int character;
        int frequency;
        Node left, right;

        Node(int character, int frequency) {
            this.character = character;
            this.frequency = frequency;
        }

        Node(Node left, Node right) {
            this.character = -1;
            this.frequency = left.frequency + right.frequency;
            this.left = left;
            this.right = right;
        }

        boolean isLeaf() {
            return left == null && right == null;
        }

        @Override
        public int compareTo(Node other) {
            return this.frequency - other.frequency;
        }
    }

    static class HuffmanCodes {
        Map<Integer, String> encodeMap = new HashMap<>();
        Map<String, Integer> decodeMap = new HashMap<>();
    }

    public static Node buildHuffmanTree(Map<Integer, Integer> frequencyMap) {
        PriorityQueue<Node> pq = new PriorityQueue<>();

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            pq.offer(new Node(entry.getKey(), entry.getValue()));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            pq.offer(new Node(left, right));
        }

        return pq.poll();
    }

    public static HuffmanCodes generateCodes(Node root) {
        HuffmanCodes codes = new HuffmanCodes();
        generateCodesRecursive(root, "", codes);
        return codes;
    }

    private static void generateCodesRecursive(Node node, String code, HuffmanCodes codes) {
        if (node == null) return;

        if (node.isLeaf()) {
            // Если это корень и лист одновременно (один символ в файле)
            if (code.isEmpty()) {
                code = "0"; // Присваиваем код "0" для одного символа
            }
            codes.encodeMap.put(node.character, code);
            codes.decodeMap.put(code, node.character);
        } else {
            generateCodesRecursive(node.left, code + "0", codes);
            generateCodesRecursive(node.right, code + "1", codes);
        }
    }
    public static Map<Integer, Integer> buildFrequencyMap(byte[] data) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (byte b : data) {
            int value = b & 0xFF;
            frequencyMap.put(value, frequencyMap.getOrDefault(value, 0) + 1);
        }
        return frequencyMap;
    }

    public static String encode(byte[] data, HuffmanCodes codes) {
        StringBuilder encoded = new StringBuilder();
        for (byte b : data) {
            int value = b & 0xFF;
            String code = codes.encodeMap.get(value);
            if (code == null || code.isEmpty()) {
                System.out.println("ERROR: No code found for character: " + value);
                return "";
            }
            encoded.append(code);
        }
        return encoded.toString();
    }

    public static byte[] decode(String encodedData, HuffmanCodes codes) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        StringBuilder currentCode = new StringBuilder();

        for (char bit : encodedData.toCharArray()) {
            currentCode.append(bit);
            if (codes.decodeMap.containsKey(currentCode.toString())) {
                int value = codes.decodeMap.get(currentCode.toString());
                output.write(value);
                currentCode.setLength(0);
            }
        }

        return output.toByteArray();
    }

    public static String serializeTree(Node root) {
        if (root == null) return "";
        StringBuilder sb = new StringBuilder();
        serializeTreeRecursive(root, sb);
        return sb.toString();
    }

    private static void serializeTreeRecursive(Node node, StringBuilder sb) {
        if (node.isLeaf()) {
            sb.append('1');
            sb.append((char) node.character);
        } else {
            sb.append('0');
            serializeTreeRecursive(node.left, sb);
            serializeTreeRecursive(node.right, sb);
        }
    }

    public static Node deserializeTree(String data) {
        if (data.isEmpty()) return null;
        int[] index = {0};
        return deserializeTreeRecursive(data, index);
    }

    private static Node deserializeTreeRecursive(String data, int[] index) {
        if (index[0] >= data.length()) return null;

        char type = data.charAt(index[0]++);

        if (type == '1') {
            char character = data.charAt(index[0]++);
            return new Node((int) character, 0);
        } else {
            Node left = deserializeTreeRecursive(data, index);
            Node right = deserializeTreeRecursive(data, index);
            return new Node(left, right);
        }
    }

    public static byte[] binaryStringToBytes(String binaryString) {
        int length = binaryString.length();
        int byteCount = (length + 7) / 8;
        byte[] bytes = new byte[byteCount];

        for (int i = 0; i < length; i++) {
            if (binaryString.charAt(i) == '1') {
                bytes[i / 8] |= (1 << (7 - (i % 8)));
            }
        }

        return bytes;
    }

    public static String bytesToBinaryString(byte[] bytes, int bitCount) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < bitCount; i++) {
            int byteIndex = i / 8;
            int bitIndex = 7 - (i % 8);
            if ((bytes[byteIndex] & (1 << bitIndex)) != 0) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }

        return sb.toString();
    }

    public static byte[] readFileToBytes(String filename) throws IOException {
        File file = new File(filename);
        byte[] data = new byte[(int) file.length()];
        try (FileInputStream fis = new FileInputStream(file)) {
            fis.read(data);
        }
        return data;
    }

    public static void writeBytesToFile(String filename, byte[] data) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(data);
        }
    }

    public static void encodeFile(String inputFile, String outputFile) throws IOException {
        byte[] data = readFileToBytes(inputFile);
        System.out.println("Original file size: " + data.length + " bytes");

        // Вывод содержимого исходного файла
        String originalContent = new String(data);
        System.out.println("Original content: " + originalContent);

        Map<Integer, Integer> frequencyMap = buildFrequencyMap(data);
        System.out.println("Frequency map: " + frequencyMap);

        Node root = buildHuffmanTree(frequencyMap);
        HuffmanCodes codes = generateCodes(root);
        System.out.println("Encoding codes: " + codes.encodeMap);

        String encodedData = encode(data, codes);
        System.out.println("Encoded data length in bits: " + encodedData.length());

        // Вывод закодированных данных (первые 100 бит)
        System.out.println("Encoded data (first 100 bits): " +
                (encodedData.length() > 100 ? encodedData.substring(0, 100) + "..." : encodedData));

        String treeSerialized = serializeTree(root);
        System.out.println("Serialized tree: " + treeSerialized);

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(outputFile))) {
            dos.writeInt(treeSerialized.length());
            dos.writeChars(treeSerialized);
            dos.writeInt(encodedData.length());
            byte[] encodedBytes = binaryStringToBytes(encodedData);
            dos.write(encodedBytes);
        }

        System.out.println("File encoded: " + inputFile + " -> " + outputFile);
        System.out.println("Original size: " + data.length + " bytes");
        System.out.println("Encoded size: " + new File(outputFile).length() + " bytes");
    }

    public static void decodeFile(String inputFile, String outputFile) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(inputFile))) {
            int treeLength = dis.readInt();
            System.out.println("Tree length: " + treeLength + " characters");

            StringBuilder treeBuilder = new StringBuilder();
            for (int i = 0; i < treeLength; i++) {
                char c = dis.readChar();
                treeBuilder.append(c);
            }
            String treeSerialized = treeBuilder.toString();
            System.out.println("Serialized tree: " + treeSerialized);

            Node root = deserializeTree(treeSerialized);
            HuffmanCodes codes = generateCodes(root);
            System.out.println("Decoding codes: " + codes.decodeMap);

            int bitCount = dis.readInt();
            System.out.println("Bits in data: " + bitCount);

            int byteCount = (bitCount + 7) / 8;
            byte[] encodedBytes = new byte[byteCount];
            dis.readFully(encodedBytes);

            String encodedData = bytesToBinaryString(encodedBytes, bitCount);
            System.out.println("Encoded data (first 100 bits): " +
                    (encodedData.length() > 100 ? encodedData.substring(0, 100) + "..." : encodedData));

            byte[] decodedData = decode(encodedData, codes);
            System.out.println("Decoded bytes: " + decodedData.length);

            // Вывод содержимого декодированного файла
            String decodedContent = new String(decodedData);
            System.out.println("Decoded content: " + decodedContent);

            writeBytesToFile(outputFile, decodedData);
        }

        System.out.println("File decoded: " + inputFile + " -> " + outputFile);
    }

    public static void main(String[] args) {
        if (args.length >= 3) {
            // Режим командной строки
            try {
                String command = args[0];
                String inputFile = args[1];
                String outputFile = args[2];

                if ("encode".equals(command)) {
                    encodeFile(inputFile, outputFile);
                } else if ("decode".equals(command)) {
                    decodeFile(inputFile, outputFile);
                } else {
                    System.out.println("Unknown command: " + command);
                    printUsage();
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            // Интерактивный режим
            runInteractiveMode();
        }
    }

    public static void viewEncodedFile(String filename) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            int treeLength = dis.readInt();
            System.out.println("Tree length: " + treeLength);

            System.out.print("Tree data (hex): ");
            for (int i = 0; i < treeLength; i++) {
                char c = dis.readChar();
                System.out.print(String.format("%04x ", (int) c));
            }
            System.out.println();

            int bitCount = dis.readInt();
            System.out.println("Data bits: " + bitCount);

            int byteCount = (bitCount + 7) / 8;
            byte[] dataBytes = new byte[byteCount];
            dis.readFully(dataBytes);

            System.out.print("Encoded data (hex): ");
            for (int i = 0; i < Math.min(20, byteCount); i++) {
                System.out.print(String.format("%02x ", dataBytes[i]));
            }
            if (byteCount > 20) System.out.print("...");
            System.out.println();
        }
    }
    private static void runInteractiveMode() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nHuffman Coding");
            System.out.println("1. Encode file");
            System.out.println("2. Decode file");
            System.out.println("3. Exit");
            System.out.print("Choose action: ");

            String choice = scanner.nextLine();

            try {
                switch (choice) {
                    case "1":
                        System.out.print("Enter input file path: ");
                        String inputEncode = scanner.nextLine();
                        System.out.print("Enter output file path for encoded file: ");
                        String outputEncode = scanner.nextLine();
                        encodeFile(inputEncode, outputEncode);
                        break;

                    case "2":
                        System.out.print("Enter encoded file path: ");
                        String inputDecode = scanner.nextLine();
                        System.out.print("Enter output file path for decoded file: ");
                        String outputDecode = scanner.nextLine();
                        decodeFile(inputDecode, outputDecode);
                        break;

                    case "3":
                        System.out.println("Exiting program");
                        scanner.close();
                        return;
                    case "4":
                        System.out.print("Enter encoded file to view: ");
                        String viewFile = scanner.nextLine();
                        viewEncodedFile(viewFile);
                        break;

                    default:
                        System.out.println("Invalid choice");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void printUsage() {
        System.out.println("Usage:");
        System.out.println("  Encode: java HuffmanCoding encode <input_file> <output_file>");
        System.out.println("  Decode: java HuffmanCoding decode <input_file> <output_file>");
        System.out.println("  Interactive mode: java HuffmanCoding");
    }
}

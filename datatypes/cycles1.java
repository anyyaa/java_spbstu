public class InfiniteCycles {
    public static void main(String[] args) {
        System.out.println("бесконечные циклы (добавила закомментированный выход из них):");
        
        int value1 = 1;
        while (true) {
            System.out.println("while: " + value1);
            value1++;
            // if (value1 > 5) {
            //     break;
            // }
        }

        int value2 = 1;
        do {
            System.out.println("do-while: " + value2);
            value2++;
            // if (value2 > 5) {
            //    break;
            // }
        } while (true);
        
        int value3 = 1;
        for (;;) {
            System.out.println("for: " + value3);
            value3++;
            // if (value3 > 5) {
            //     break;
            //}
        }
    }
}

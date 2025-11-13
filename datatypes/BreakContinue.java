public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("break и continue:");
        
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("i = " + i);
        }
        
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue;
            }
            System.out.println("j = " + j);
        }
        
        int k = 0;
        while (k < 10) {
            k++;
            if (k % 2 == 0) {
                continue;
            }
            if (k > 7) {
                break;
            }
            System.out.println("k = " + k);
        }
        
        int m = 1;
        do {
            if (m == 4) {
                break;
            }
            System.out.println("m = " + m);
            m++;
        } while (m <= 5);
        
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            if (num == 3) {
                continue;
            }
            if (num == 5) {
                break;
            }
            System.out.println("num = " + num);
        }
    }
}

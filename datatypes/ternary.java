public class TernaryExample {
    public static void main(String[] args) {
        int a = 2;
        
        // через if-else
        int i1 = 0;
        if (a == 1) {
            i1 = 1;
        } else if (a == 2) {
            i1 = 2;
        } else {
            i1 = 3;
        }
        
        // через тернарный оператор
        int i2 = (a == 1) ? 1 : (a == 2) ? 2 : 3;
        
        System.out.println("if-else result: " + i1);
        System.out.println("ternary result: " + i2);
    }
}

public class CalculatorSecond {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }

    public int sum(int... numbers) {
        int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
    }

    public static void main(String[] args) {
        CalculatorSecond calc = new CalculatorSecond();

        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum(1, 2, 3));
        System.out.println(calc.sum(1, 2, 3, 4, 5));
    }
}

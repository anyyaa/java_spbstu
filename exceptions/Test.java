class PaymentException extends Exception {
    private double amount;
    
    public PaymentException() {
        super("Payment error");
    }
    
    public PaymentException(String message) {
        super(message);
    }
    
    public PaymentException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public PaymentException(String message, double amount) {
        super(message);
        this.amount = amount;
    }
    
    public double getAmount() {
        return amount;
    }
}

public class Test {
    public static void processPayment(double sum) throws PaymentException {
        if (sum <= 0) {
            throw new PaymentException("Invalid amount: " + sum, sum);
        }
        System.out.println("Payment processed: " + sum);
    }
    
    public static void main(String[] args) {
        try {
            processPayment(-100);
        } catch (PaymentException e) {
            System.out.println("Error: " + e.getMessage() + ", amount: " + e.getAmount());
        }
    }
}

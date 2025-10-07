public interface Vehicle { 
    class Engine {
        public void start() {
            System.out.println("Engine started!");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle.Engine engine = new Vehicle.Engine();
        engine.start();
    }
}

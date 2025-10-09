enum Season {
    WINTER, SPRING, SUMMER, AUTUMN
}

public class SeasonDemo {
    public void describeSeason() {
        System.out.println("Общее описание сезона");
    }

    public void describeSeason(Season s) {
        switch (s) {
            case WINTER:
                System.out.println("холодно");
                break;
            case SPRING:
                System.out.println("тепло");
                break;
            case SUMMER:
                System.out.println("жарко");
                break;
            case AUTUMN:
                System.out.println("прохладно");
                break;
        }
    }

    public void describeSeason(Season s, int avgTemp) {
        System.out.println(s + ": средняя температура " + avgTemp + "°C");
    }

    public static void main(String[] args) {
        SeasonDemo demo = new SeasonDemo();

        demo.describeSeason();                 // вызов без параметров
        demo.describeSeason(Season.SUMMER);   // вызов с одним параметром
        demo.describeSeason(Season.WINTER, -5); // вызов с двумя параметрами
    }
}

enum Season {
    WINTER("Холодно", -10),
    SPRING("Тепло", 10),
    SUMMER("Жарко", 25),
    AUTUMN("Прохладно", 5);

    private final String description;
    private final int averageTemp;

    Season(String description, int averageTemp) {
        this.description = description;
        this.averageTemp = averageTemp;
    }

    public String getDescription() {
        return description;
    }

    public int getAverageTemp() {
        return averageTemp;
    }

    public void printInfo() {
        System.out.println(this + ": " + description + ", средняя температура " + averageTemp + "°C");
    }
}

public class EnumSeasonDemo {
    public static void main(String[] args) {
        for (Season s : Season.values()) {
            s.printInfo();
        }
    }
}

enum Season {
    WINTER("Холодно"),
    SPRING("Тепло"),
    SUMMER("Жарко"),
    AUTUMN("Прохладно");

    private final String description; 
    Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        for (Season s : Season.values()) {
            System.out.println(s + " — " + s.getDescription());
        }
    }
}

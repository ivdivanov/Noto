import java.util.Objects;

public class Food {

    private String description;
    private double price;
    private String name;

    Food(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return description.equals(food.description) && name.equals(food.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description, name);
    }

    public String getName() {
        return name;
    }
}

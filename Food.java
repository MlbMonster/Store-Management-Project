public class Food {
    private String name;
    private double price;
    private int calories;
    private String bunType;

    // Constructor
    public Food(String name, double price, int calories, String bunType) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.bunType = bunType;
    }

    // Accessor (getter) methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    public String getBunType() {
        return bunType;
    }

    // toString() method to return the state of the object
    @Override
    public String toString() {
        return "Name: " + name + ", Price: $" + price + ", Calories: " + calories + ", Bun: " + bunType;
    }
}
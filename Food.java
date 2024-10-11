public class Food {
    private String name;
    private double price;
    private int calories;
    private String bunType;

    // Constructorr
    public Food(String name, double price, int calories, String bunType) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        this.bunType = bunType;
    }

    // Methods to get the information
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

    // Method to print food details in to the console
    public void printFoodInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Calories: " + calories);
        System.out.println("Bun Type: " + bunType);
    }
}
public class Burger extends Food {
    private String meatType;
    private boolean hasCheese;

    // Constructor
    public Burger(String name, double price, int calories, String bunType, String meatType, boolean hasCheese) {
        super(name, price, calories, bunType);
        this.meatType = meatType;
        this.hasCheese = hasCheese;
    }

    // Accessor (getter) methods
    public String getMeatType() {
        return meatType;
    }

    public boolean hasCheese() {
        return hasCheese;
    }

    // Method to add cheese
    public void addCheese() {
        this.hasCheese = true;
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + ", Meat Type: " + meatType + ", Cheese: " + (hasCheese ? "Yes" : "No");
    }
}

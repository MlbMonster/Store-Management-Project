public class Burger extends Food {
    private String meatType;
    private boolean hasCheese;

    // Constructor
    public Burger(String name, double price, int calories, String bunType, String meatType, boolean hasCheese) {
        super(name, price, calories, bunType);
        this.meatType = meatType;
        this.hasCheese = hasCheese;
    }

    // Method to print burgr details
    public void printBurgerInfo() {
        printFoodInfo();
        System.out.println("Meat Type: " + meatType);
        if (hasCheese) {
            System.out.println("Has Cheese: Yes");
        } else {
            System.out.println("Has Cheese: No");
        }
    }
}
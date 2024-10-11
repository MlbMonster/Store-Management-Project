public class Hotdog extends Food {
    private String sausageType;
    private boolean hasMustard;

    // Constructor
    public Hotdog(String name, double price, int calories, String bunType, String sausageType, boolean hasMustard) {
        super(name, price, calories, bunType);
        this.sausageType = sausageType;
        this.hasMustard = hasMustard;
    }

    // MEthod to print hotdog details
    public void printHotdogInfo() {
        printFoodInfo();
        System.out.println("Sausage Type: " + sausageType);
        if (hasMustard) {
            System.out.println("Has Mustard: Yes");
        } else {
            System.out.println("Has Mustard: No");
        }
    }
}
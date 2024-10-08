public class Hotdog extends Food {
    private String sausageType;
    private boolean hasMustard;

    // Constructor
    public Hotdog(String name, double price, int calories, String bunType, String sausageType, boolean hasMustard) {
        super(name, price, calories, bunType);
        this.sausageType = sausageType;
        this.hasMustard = hasMustard;
    }

    // Accessor (getter) methods
    public String getSausageType() {
        return sausageType;
    }

    public boolean hasMustard() {
        return hasMustard;
    }

    // Method to add mustard
    public void addMustard() {
        this.hasMustard = true;
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + ", Sausage Type: " + sausageType + ", Mustard: " + (hasMustard ? "Yes" : "No");
    }
}
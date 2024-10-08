import java.util.Scanner;

public class StoreRunner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Creating a Burger object
        Burger burger = new Burger("Cheeseburger", 5.99, 650, "Sesame", "Beef", true);
        System.out.println(burger);

        // Creating a Hotdog object
        Hotdog hotdog = new Hotdog("Classic Hotdog", 3.99, 300, "Plain", "Beef", false);
        System.out.println(hotdog);

        input.close();
    }
}
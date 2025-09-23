import java.util.*;

// Abstract class Product
abstract class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public abstract double getDiscountedPrice();

    public void displayProductInfo() {
        System.out.println("PRODUCT ID: " + id);
        System.out.println("PRODUCT NAME: " + name);
        System.out.println("BASE PRICE: $" + price);
        System.out.println("DISCOUNTED PRICE: $" + getDiscountedPrice());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Product)) return false;
        Product p = (Product) obj;
        return this.id == p.id;
    }
}

// OrganicProduct subclass
class OrganicProduct extends Product {
    public OrganicProduct(int id, String name, double price) {
        super(id, name, price);
    }
    @Override
    public double getDiscountedPrice() {
        return getPrice() * 0.90;
    }
    @Override
    public String toString() {
        return "PRODUCT ID: " + getId() +
               ", NAME: " + getName() +
               ", BASE PRICE: $" + getPrice() +
               ", DISCOUNTED PRICE: $" + getDiscountedPrice();
    }
}

// RecycledProduct subclass
class RecycledProduct extends Product {
    public RecycledProduct(int id, String name, double price) {
        super(id, name, price);
    }
    @Override
    public double getDiscountedPrice() {
        return getPrice() * 0.95;
    }
    @Override
    public String toString() {
        return "PRODUCT ID: " + getId() +
               ", NAME: " + getName() +
               ", BASE PRICE: $" + getPrice() +
               ", DISCOUNTED PRICE: $" + getDiscountedPrice();
    }
}

// Cart class
class Cart {
    private List<Product> items = new ArrayList<>();
    private static int totalCartsCreated = 0;
    public static final double TAX_RATE = 0.05;

    public Cart() {
        totalCartsCreated++;
    }

    public void addItem(Product p) {
        items.add(p);
    }

    public void addItem(Product... products) {
        items.addAll(Arrays.asList(products));
    }

    public void addItem(int productId, int quantity) {
        System.out.println("ADDED " + quantity + " UNITS OF PRODUCT ID " + productId);
    }

    public static int getCartCount() {
        return totalCartsCreated;
    }

    public void printCartItems() {
        if (items.isEmpty()) {
            System.out.println("CART IS EMPTY.");
        } else {
            for (Product p : items) {
                System.out.println(p);
            }
        }
    }

    public final void printBillHeader() {
        System.out.println("******* ECOCART BILL ********");
    }

    public void generateBill() {
        double subtotal = 0;
        for (Product p : items) {
            subtotal += p.getDiscountedPrice();
        }
        double tax = subtotal * TAX_RATE;
        double total = subtotal + tax;
        printBillHeader();
        System.out.println("SUBTOTAL: $" + subtotal);
        System.out.println("TAX (5%): $" + tax);
        System.out.println("TOTAL: $" + total);
    }
}

// Final class EcoRules
final class EcoRules {
    public static void printRules() {
        System.out.println("USE ECO FRIENDLY BAGS.");
        System.out.println("RECYCLE WASTE RESPON.");
    }
}

// Main class
public class EcoCartSystem {
    public static void main(String[] args) {
        Product p1 = new OrganicProduct(1, "ORGANIC APPLE", 100);
        Product p2 = new RecycledProduct(2, "RECYCLED NOTEBOOKS", 200);

        Cart cart1 = new Cart();
        cart1.addItem(p1);
        cart1.addItem(p2);

        Cart cart2 = new Cart();
        cart2.addItem(3, 5);

        System.out.println("\n--- STATIC VS NON STATIC DEMO ---");
        System.out.println("TOTAL CART CREATED: " + Cart.getCartCount());
        cart1.printCartItems();

        System.out.println("\n--- BILL FOR CART 1 ---");
        cart1.generateBill();

        System.out.println("\n--- ECO RULES ---");
        EcoRules.printRules();
    }
}
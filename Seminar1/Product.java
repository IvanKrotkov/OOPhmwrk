package Seminar1;

public class Product {
    protected static String name;
    protected int price;
    protected int amount;
    static protected int productId = 1;
    public Product(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
    public Product(String name, int price) {
        this(name, price, 1);
    }
    public Product(String name) {
        this(name, 100);
    }
    public Product() {
        this(String.format("Product_%d", productId++));
    }
    @Override
    public String toString() {
        return String.format("Name product: %s, price: %d, amount: %d", name, price, amount);
    }
}

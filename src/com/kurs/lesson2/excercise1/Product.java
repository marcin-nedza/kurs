package src.com.kurs.lesson2.excercise1;

public class Product {
    private String name;
    private double price;
    private Customer owner;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public void addCustomer(Customer c){
        this.setOwner(c);
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", owner=" + owner + "]";
    }
}

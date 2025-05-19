package src.com.kurs.lesson2.excercise1;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String lastName;
    private String cockSize;
    private List<Product> prodList = new ArrayList<>();

    public Customer(String name, String lastName, String cockSize) {
        this.name = name;
        this.lastName = lastName;
        this.cockSize = cockSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCockSize() {
        return cockSize;
    }

    public void setCockSize(String cockSize) {
        this.cockSize = cockSize;
    }

    public List<Product> getProdList() {
        return prodList;
    }

    public void setProdList(List<Product> prodList) {
        this.prodList = prodList;
    }

    public void buy(Product prod) {
        prodList.add(prod);
        prod.setOwner(this);
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", lastName=" + lastName + ", cockSize=" + cockSize + "]";
    }

    public double getCustomerSpending() {
        return prodList.stream().mapToDouble(Product::getPrice).sum();
    }

}

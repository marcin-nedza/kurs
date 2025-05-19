package src.com.kurs.lesson2.excercise2;

import java.util.HashMap;
import java.util.Map;

public class Client extends Person {
    private Map<Product, Integer> prodList = new HashMap<>();

    public Client(String name, String lastName) {
        super(name, lastName);
    }

    public Map<Product, Integer> getProdList() {
        return prodList;
    }


    public void setProdList(Map<Product, Integer> prodList) {
        this.prodList = prodList;
    }

    public void buy(Product prod) {
        if (prodList.containsKey(prod)) {
            int val = prodList.get(prod);
            prodList.put(prod, val+1);
        } else {
            prodList.put(prod, 1);
        }
    }

    @Override
    public String toString() {
        return "Client [name=" + getName() + ", lastName=" + getLastName() + "]";
    }



}

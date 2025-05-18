package src.com.kurs.lesson2.excercise1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product pr1 = new Product("asd", 2);
        Condom p2 = new Condom("ASdas", 2, "XL");
        Customer cust = new Customer("Maciek", "korcal", "S");
        System.out.println(pr1);
        System.out.println(p2);
        pr1.addCustomer(cust);
        p2.addCustomer(cust);
        cust.setProdList(List.of(pr1,p2));
        cust.getCustomerSpending();
    }
}

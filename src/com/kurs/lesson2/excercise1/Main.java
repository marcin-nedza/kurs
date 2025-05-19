package src.com.kurs.lesson2.excercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Jan", "Kowalski", "M");
        Customer c2 = new Customer("Anna", "Nowak", "S");
        Customer c3 = new Customer("Olek", "Wiśniewski", "XL");

        Product lube = new SimpleProduct("Lube", 10);
        Product c1Condom = new Condom("Durex XL", 15, "XL");
        Product c2Condom = new Condom("Durex S", 10, "S");
        Product wrongCondom = new Condom("Durex L", 8, "L");

        c1.buy(lube);
        c1.buy(wrongCondom);

        c2.buy(c2Condom); 

        c3.buy(c1Condom); 

        List<Customer> customers = List.of(c1, c2, c3);

        Customer topSpender = getTopSpender(customers);
        System.out.println("1. Top spender: " + topSpender + " — " + topSpender.getCustomerSpending() + " PLN");

        List<Customer> boughtCondoms = getCustWithCondoms(customers);
        System.out.println("2. Customers who bought condoms: " + boughtCondoms);

        List<Customer> wrongSize = getCustWrongSize(customers);
        System.out.println("3. Customers with wrong condom size: " + wrongSize);
    }

    public static Customer getTopSpender(List<Customer> c) {
        return c.stream().max((c1, c2) -> Double.compare(c1.getCustomerSpending(), c2.getCustomerSpending()))
                .orElse(null);

    }

    public static List<Customer> getCustWithCondoms(List<Customer> cust) {
        return cust.stream().filter(c -> c.getProdList().stream().anyMatch(p -> p instanceof Condom))
                .collect(Collectors.toList());
    }

    public static List<Customer> getCustWrongSize(List<Customer> cust) {
        List<Customer> res = new ArrayList<>();
        for (Customer customer : cust) {
            for (Product pr : customer.getProdList()) {
                if (pr instanceof Condom) {
                    Condom cond = (Condom) pr;
                    if (customer.getCockSize() != cond.getSize()) {
                        res.add(customer);
                    }
                }
            }

        }
        return res;
    }
}

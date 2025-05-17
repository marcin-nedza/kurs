package src.com.kurs.lesson2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Car car1=new Car("Audi","1","23099239293");
        Car car2=new Car("Audi","1","23099239293");
        Car car3=new Car("Fiat","126p","2309923929222");
        List<Car> carlist=new ArrayList<>();
        carlist.add(car1);
        carlist.add(car2);
        carlist.add(car3);
        System.out.println(carlist);

        Set<Car> carset=new HashSet<>();
        carset.add(car1);
        carset.add(car2);
        carset.add(car3);
        System.out.println(carset);
    }


}

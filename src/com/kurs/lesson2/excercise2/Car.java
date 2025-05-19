package src.com.kurs.lesson2.excercise2;

import java.util.HashMap;
import java.util.Map;

public class Car {
    private String brand;
    private String model;
    private Map<Employee, Integer> empList = new HashMap<>();

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Map<Employee, Integer> getEmpList() {
        return empList;
    }

    public void setEmpList(Map<Employee, Integer> empList) {
        this.empList = empList;
    }

    public void use(Employee empl) {
        if (empList.containsKey(empl)) {
            int val = empList.get(empl);
            empList.put(empl, val + 1);
        } else {
            empList.put(empl, 1);
        }
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + ", empList=" + empList + "]";
    }
}

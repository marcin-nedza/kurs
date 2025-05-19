package src.com.kurs.lesson2.excercise2;

public class Employee extends Person {
    private String adress;
    private int salary;

    public Employee(String name, String lastName, String adress, int salary) {
        super(name, lastName);
        this.adress = adress;
        this.salary = salary;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void rideCar(Car car) {
        car.use(this);
    }

    @Override
    public String toString() {
        return "Employee [name= " + getName() + " lastName " + getLastName() + " adress=" + adress + ", salary="
                + salary + "]";
    }

}

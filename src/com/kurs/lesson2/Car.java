package src.com.kurs.lesson2;

public class Car {
    private String brand;
    private String model;
    private String vin;

    public Car(String brand, String model, String vin) {
        this.brand = brand;
        this.model = model;
        this.vin = vin;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((vin == null) ? 0 : vin.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (vin == null) {
            if (other.vin != null)
                return false;
        } else if (!vin.equals(other.vin))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Car [brand=" + brand + ", model=" + model + ", vin=" + vin + "]";
    }

}

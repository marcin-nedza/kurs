package src.com.kurs.lesson2.excercise1;

public class Condom extends Product {
    private String size;

    public Condom(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return super.toString() + " ,Condom [size=" + size + "]";
    }

}

package web.model;

public class Car {
    private String mark;
    private int year;
    private int price;

    public Car() {
    }

    public Car(String mark, int year, int price) {
        this.mark = mark;
        this.year = year;
        this.price = price;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}

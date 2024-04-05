public class Automobile {
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;
    private double price;
    private String vin;
    private boolean available;

    // Default constructor ...
    public Automobile() {
        this.make = "";
        this.model = "";
        this.color = "";
        this.year = 0;
        this.mileage = 0;
        this.price = 0.0;
        this.vin = "";
        this.available = true;
    }

    // Parameterized constructor ...
    public Automobile(String make, String model, String color, int year, int mileage, double price, String vin, boolean available) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
        this.vin = vin;
        this.available = available;
    }
}

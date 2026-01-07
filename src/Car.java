public class Car implements IVehicle{
    String brand;
    int year;
    double price;
    int wheel;
    String engine;

    public Car(String brand, int year, double price, int wheel, String engine){
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.wheel = wheel;
        this.engine = engine;
    }

    @Override
    public void Running(){
        System.out.println("Car is running...");
    }

    @Override
    public String getBrand(){
        return brand;
    }

    @Override
    public void setBrand(String brand){
        this.brand = brand;
    }
}

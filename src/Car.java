public class Car implements IVehicle{
    String brand;
    int year;
    double price;
    int wheel;
    Engine engine;

    public Car(String brand, int year, double price, int wheel, String engine){
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.wheel = wheel;
        this.engine = new Engine("engine1", 2, 45.64);
    }

    @Override
    public void Running(){
        engine.Running();
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

    @Override
    public double getPrice(){
        return price;
    }

    @Override
    public void setPrice(double price){
        this.price = price;
    }
}

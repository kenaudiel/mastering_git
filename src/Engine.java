public class Engine {
    String name;
    int year;
    double price;
    
    public Engine(String name, int year, double price){
        this.name = name;
        this.year = year;
        this.price = price;
    }

    public void Running(){
        System.out.println("Engine is running...");
    }
}

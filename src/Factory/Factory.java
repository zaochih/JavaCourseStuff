package Factory;

public class Factory {
    public Car produceCar(String brand)
    {
        if (brand.equalsIgnoreCase("BMW")) {
            return new BMW();
        } else if (brand.equalsIgnoreCase("Audi")) {
            return new Audi();
        } else if (brand.equalsIgnoreCase("Benz")) {
            return new Benz();
        } else {
            return null;
        }
    }
}

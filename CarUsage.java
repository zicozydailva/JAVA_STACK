public class CarUsage {
    public static void main(String[] args) {
        // an instance
        Car car = new Car();
        car.setMake("tesla");
        car.setModel("Model-X");
        car.setColor("Green");
        car.setConvertible(false);
        car.setDoors(5);

        // another instance
        Car targa = new Car();
        targa.setMake("toyota");
        targa.setModel("Camry");
        targa.setColor("White");
        targa.setConvertible(true);
        targa.setDoors(2);

        car.describeCar();
        targa.describeCar();

    }
}

public class Car {
    private  String make = "Tesla";
    private  String model  = "Model x";
    private String color = "Orange";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public boolean getConvertible() {
        return convertible;
    }


    public void setMake(String make) {
        String realMake = make.toLowerCase();
        if(realMake == "tesla" || realMake == "toyota") {
            this.make = make;
        }  else {
            this.make = "unsupported";
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public String getModel() {
        return model;
    }


    public void describeCar() {
        System.out.println(doors + "-Door" + " " + color + " " + make + " " + model + " " + (convertible ? "Convertible" : " "));
    }
}

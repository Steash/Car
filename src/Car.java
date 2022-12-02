public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public String startEngine() {
        return this.name + "'s engine is starting."; // "Car -> startEngine()"
    }

    public String accelerate() {
        return this.name + " is accelerating.";
    }

    public String brake() {
        return this.name + " is braking.";
    }

    public String getName() {

        return this.name;
    }

    public void setName(String newName) {

        this.name = newName;
    }

    public int getCylinders() {

        return this.cylinders;
    }

    public void setCylinders(int newCylinders) {

        this.cylinders = newCylinders;
    }
}

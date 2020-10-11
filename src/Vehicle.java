public class Vehicle {
    private static int nextID = 1;
    private final int vehicleId;
    private int speed;
    private int direction;
    private String ownerName;

    public Vehicle() {
        this.vehicleId = nextID++;
    }

    public Vehicle(String ownerName) {
        this.vehicleId = nextID++;
        this.ownerName = ownerName;
        this.speed = 0;
        this.direction = 0;
    }

    public int getNExtID() {
       return Vehicle.nextID;
    }

    public int getVehicleId() {
        return this.vehicleId;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getDirection() {
        return this.direction;
    }

    public static int highestId() {
        return nextID - 1;
    }

    public void changeSpeed(int change) {
        if ((this.speed + change) > 0)
            this.speed += change;
        else
            this.speed = 0;
    }

    public void stop() {
        this.speed = 0;
    }

    public String toString() {
        String out = "VehicleID = " + vehicleId + " (" + ownerName + ") "+
                "\nSpeed = " + speed+
                "\nDirection = " + direction;

        return  out;
    }

    public static void main(String[] args) {
        Vehicle simoneCar = new Vehicle("Simone");

        System.out.println(simoneCar);
    }

}

public class Vehicle {
    static int nextId = 1;
    final int vehicleId;
    int speed;
    int direction;
    String ownerName;

    Vehicle() {
        this.vehicleId = nextId++;
    }

    Vehicle(String ownerName) {
        this.vehicleId = nextId++;
        this.ownerName = ownerName;
    }

    static int highestId() {
        return nextId - 1;
    }

    void changeSpeed(int decrese) {
        this.speed -= decrese;
    }

    void stop() {
        this.speed = 0;
    }

    public String toString() {
        String out = "VehicleID = " + vehicleId + " (" + ownerName + ") "+
                "Speed = " + speed+
                " Direction = " + direction;

        return  out;
    }

    public static void main(String[] args) {
        Vehicle simoneCar = new Vehicle("Simone");

        System.out.println(simoneCar);
    }

}

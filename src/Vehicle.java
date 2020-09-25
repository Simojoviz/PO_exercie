public class Vehicle {
    static int nextId = 1;
    int vehicleId;
    int speed;
    int direction;
    String ownerName;

    Vehicle() {
        vehicleId = nextId++;
    }

    Vehicle(String ownerName) {
        vehicleId = nextId++;
        this.ownerName = ownerName;
    }

    static int highestId() {
        return nextId - 1;
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

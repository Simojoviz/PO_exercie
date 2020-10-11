public class Vehicle {
    private static int nextId = 1;
    final int vehicleId;
    private int speed;
    private int direction;
    private String ownerName;

    Vehicle() {
        this.vehicleId = nextId++;
    }

    Vehicle(String ownerName) {
        this.vehicleId = nextId++;
        this.ownerName = ownerName;
    }

    public static int highestId() {
        return nextId - 1;
    }


    private void changeSpeed(int decrease) {
        if (decrease >= this.speed)
            this.speed -= decrease;
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

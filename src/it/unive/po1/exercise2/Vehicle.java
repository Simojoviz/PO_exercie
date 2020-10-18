package it.unive.po1.exercise2;

import it.unive.po1.exercise3.Battery;
import it.unive.po1.exercise3.EnergySource;

public class Vehicle {
    private static int nextID = 1;
    private final int vehicleId;
    private int speed;
    private int direction;
    private String ownerName;
    private EnergySource energySource;

    public Vehicle() {
        this.vehicleId = nextID++;
    }

    public Vehicle(String ownerName, EnergySource source) {
        this.vehicleId = nextID++;
        this.ownerName = ownerName;
        this.speed = 0;
        this.direction = 0;
        this.energySource = source;
    }

    public static int getNextID() {
       return Vehicle.nextID;
    }

    public final int getVehicleId() {
        return this.vehicleId;
    }

    public final int getSpeed() {
        return this.speed;
    }

    public final int getDirection() {
        return this.direction;
    }

    public static int highestId() {
        return Vehicle.nextID - 1;
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

    public boolean start() {
        return this.energySource.empty();
    }

    public String toString() {
        String out = "VehicleID = " + vehicleId + " (" + ownerName + ") "+
                "\nSpeed = " + speed+
                "\nDirection = " + direction;

        return  out;
    }
}

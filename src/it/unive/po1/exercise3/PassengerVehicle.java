package it.unive.po1.exercise3;

import it.unive.po1.exercise2.Vehicle;

public class PassengerVehicle extends Vehicle {
    private final int availableSeats;

    private int occupiedSeats;

    public PassengerVehicle(String ownerName,EnergySource source, int seats) {
        super(ownerName, source);
        this.availableSeats = seats;
    }

    public PassengerVehicle(int availableSeats) {
        super();
        this.availableSeats = availableSeats;
    }

    public void setOccupiedSeats(int seats) {
        if (seats < this.availableSeats)
            this.occupiedSeats = seats;
        else
            this.occupiedSeats = this.availableSeats;
    }

    public int getOccupiedSeats() {
        return this.occupiedSeats;
    }

    public int getAvailableSeats() {
        return this.availableSeats;
    }

    public String toString() {
        String out = super.toString();
        out += "\nSeats = " + this.availableSeats + "\n";
        return out;
    }
    /*
    public static void main(String[] args) {
        for (int i = 0; i<5; i++) {
            PassengerVehicle iter = new PassengerVehicle(10);
            System.out.println(iter);
        }
    }
     */
}

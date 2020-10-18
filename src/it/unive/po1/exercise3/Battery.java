package it.unive.po1.exercise3;

public class Battery extends EnergySource {

    private int charge;

    public boolean empty() {
        return this.charge <= 0;
    }
}

package it.unive.po1.exercise2;

public class LinkedList {
    private Object elem;
    private LinkedList next;

    public Object getElem() {
        return this.elem;
    }

    public void setElem(Object _new) {
        this.elem = _new;
    }

    public LinkedList getNext() {
        return this.next;
    }

    public LinkedList() {
        this.elem = null;
        this.next = null;
    }

    public LinkedList(Object elem) {
        this.elem = elem;
        this.next = null;
    }

    int listLength() {
        if (this.next == null)
            return 1;
        else
            return 1 + this.next.listLength();
    }

    public void addElem(Object new_elem) {
        if (this.next == null)
            this.next = new LinkedList(new_elem);
        else
            this.next.addElem(new_elem);
    }

    public String toString() {
        String out = "";
        if (this.next == null)
            return (out + this.elem);
        else {
            return (out + this.elem + "\n\n" + this.next.toString());
        }
    }

    public static void main(String[] args) {
        Vehicle new_vehicle = new Vehicle();
        LinkedList vehicleList = new LinkedList(new_vehicle);

        for (int i = 0; i < 4; i++) {
            new_vehicle = new Vehicle();
            vehicleList.addElem(new_vehicle);
        }

        System.out.println(vehicleList);
    }

}

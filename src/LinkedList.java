import java.lang.invoke.VarHandle;

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

    public void append(Object new_elem) {
        if (this.next == null)
            this.next = new LinkedList(new_elem);
        else
            this.next.append(new_elem);
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
        Vehicle new_car = new Vehicle();
        LinkedList vehicleList = new LinkedList(new_car);

        for (int i = 0; i < 4; i++) {
            new_car = new Vehicle();
            vehicleList.append(new_car);
        }

        System.out.println(vehicleList);
        System.out.println(vehicleList.listLength());
    }
}

public class LinkedList {
    Object elem;
    LinkedList nextCell;

    public String toString() {
        String out = elem + " ";
        if (nextCell != null) {
            out += nextCell.toString();
        }

        return out;
    }

    int numberListElem() {
        int elem = 1;
        if (this.nextCell != null) {
            elem = 1 + this.nextCell.numberListElem();
            return elem;
        } else {
            return 0;
        }
    }
}

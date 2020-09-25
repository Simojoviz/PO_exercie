public class LinkedList {
    Object elem;
    Object nextCell;

    public String toString() {
        String out = elem + " ";
        if (nextCell != null) {
            out += nextCell.toString();
        }

        return out;
    }
}

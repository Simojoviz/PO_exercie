public class LinkedList {
    Node head;
    Node last;

    int listLength() {
        Node temp = this.head;
        int acc = 0;
        while (temp != null) {
            acc++;
            temp = temp.nextNode;
        }

        return acc;
    }

    public static void main(String[] args) {
        LinkedList vehicleList = new LinkedList();

        for (int i = 0; i < 4; i++) {
            if (vehicleList.last == null) {
                vehicleList.head = new Node(new Vehicle());
                vehicleList.last = vehicleList.head;
            } else {
                Node newNode = new Node(new Vehicle(), vehicleList.head);
                vehicleList.head = newNode;
            }
        }

        System.out.println(vehicleList.listLength());
    }
}


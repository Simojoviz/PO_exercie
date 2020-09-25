public class Node {
    Object elem;
    Node nextNode;

    public Node(Object elem, Node nextNode) {
        this.elem = elem;
        this.nextNode = nextNode;
    }

    public Node(Object elem) {
        this(elem, null);
    }
}

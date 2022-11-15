import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        Node n8 = new Node(8);
        Node n9 = new Node(9);
        Node n11 = new Node(11);
        Node n20 = new Node(20);

        Node n21 = new Node(21);
        Node n22 = new Node(22);

        root.nodes.add(n2);
        root.nodes.add(n3);

        n2.nodes.add(n4);
        n3.nodes.add(n5);
        n3.nodes.add(n6);

        n4.nodes.add(n7);
        n4.nodes.add(n8);
        n4.nodes.add(n9);
        n5.nodes.add(n11);
        n5.nodes.add(n20);

        n7.nodes.add(n21);
        n7.nodes.add(n22);
        order(root, "");
    }

    static void order(Node root, String space) {
        if (root == null)
            return;
        System.out.println(space + root.value);
        for (Node i : root.nodes) {
            order(i, space + "  ");
        }
    }
}

class Node {
    int value;

    public Node(int value) {
        this.value = value;
    }

    ArrayList<Node> nodes = new ArrayList<>();

}
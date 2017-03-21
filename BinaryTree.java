public class BinaryTree {
    Node root;

    public void addnode(int key, String name) {
    Node newNode = new Node(key, name);
    if (root == null) {
        root = newNode;
        System.out.println("Inserted : "+newNode);
    } else {
        Node focusNode = root;
        Node parent;

        while (true) {
            parent = focusNode;
            if (key < focusNode.key) {
                focusNode = focusNode.leftChild;
                if (focusNode == null) {
                    parent.leftChild = newNode;
                    System.out.println("Inserted : "+newNode);
                    return;
                }
            }
            else {
                    focusNode = focusNode.rightChild;
                    if (focusNode == null) {
                        parent.rightChild = newNode;
                        System.out.println("Inserted : "+newNode);
                        return;
                    }
            }
        }
    }
}

    public Node findNode(int key) {
        Node focusNode = root;
        while (focusNode.key != key) {

            if (key < focusNode.key) {

                focusNode = focusNode.leftChild;
            } else {

                focusNode = focusNode.rightChild;
            }
            if (focusNode == null)
                return null;

        }
        return focusNode;

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BinaryTree theTree = new BinaryTree();

        theTree.addnode(1, "Ahmad");
        theTree.addnode(2, "Ali");
        theTree.addnode(3, "Sara");
        theTree.addnode(4, "Abed");
        theTree.addnode(5, "Mohammad");

        System.out.println("Search for 4");
        System.out.println(theTree.findNode(4));

    }
}

class Node {
    int key;
    String name;

    Node leftChild;
    Node rightChild;

    Node(int key, String name) {
        this.key = key;
        this.name = name;
    }

    public String toString() {
        return name + "  has a key " + key;
    }
}
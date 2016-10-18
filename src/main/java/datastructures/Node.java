package datastructures;

/**
 * Created by calvinlowyanming on 10/12/16.
 */
public class Node {

    Node left;
    Node right;
    int data;


    public Node(int data) {
        this.left = null;
        this.right = null;
        this.data = data;
    }

    public void insert(int value) {
        if (value < data) {
            if (left == null) {
                left = new Node(value);
            } else {
                left.insert(value);
            }
        } else {
            if (right == null) {
                right = new Node(value);
            } else {
                right.insert(value);
            }
        }
    }

    public boolean contains(int value) {
        if (value == data) return true;

        if (value < data) {
            if (left == null) {
                return false;
            } else {
                return left.contains(value);
            }
        } else {
            if (right == null) {
                return false;
            } else {
                return right.contains(value);
            }
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.print(data + " -->");
        if (right != null) {
            right.printInOrder();
        }
    }

    public void printPreOrder() {
        if (this != null) {
            System.out.print(data + " -->");
        }
        if (left != null) {
            left.printPreOrder();
        }
        if (right != null) {
            right.printPreOrder();
        }
    }


    public void printPostOrder() {
        if (left != null) {
            left.printPostOrder();
        }
        if (right != null) {
            right.printPostOrder();
        }
        System.out.print(data + " -->");
    }
}

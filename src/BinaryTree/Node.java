package BinaryTree;

/**
 * Created by Wu on 4/2/2016.
 */
public class Node
{
    int value;
    Node leftChild;
    Node rightChild;

    public Node(int value)
    {
        this.value = value;
        this.leftChild = null;
        this.rightChild = null;
    }

    public void addLeftChild(Node node)
    {
        this.leftChild = node;
    }

    public void addRightChild(Node node)
    {
        this.rightChild = node;
    }

    public int getValue()
    {
        return this.value;
    }

    public Node getLeftChild()
    {
        return this.leftChild;
    }

    public Node getRightChild()
    {
        return this.rightChild;
    }

}

package LinkedList3;

/**
 * Created by Wu on 4/8/2016.
 */
public class Node3
{
    int key;
    String value;
    Node3 next = null;

    public Node3(int key, String value)
    {
        this.key = key;
        this.value = value;
    }

    public int getKey()
    {
        return this.key;
    }

    public String getValue()
    {
        return this.value;
    }

    public Node3 getNextNode()
    {
        return this.next;
    }

    public void setNextNode(Node3 node)
    {
        this.next = node;
    }

    public String toString()
    {
        return this.key + ": " + this.value;
    }
}

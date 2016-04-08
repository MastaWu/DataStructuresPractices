package LinkedList2;

/**
 * Created by Wu on 4/6/2016.
 */
public class Node2
{
    private int key;
    private String value;
    private Node2 next = null;

    public Node2(int key, String value)
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

    public Node2 getNextNode()
    {
        return this.next;
    }

    public void setNextNode(Node2 next)
    {
        this.next = next;
    }

    public String toString()
    {
        return this.key + ": " + this.value;
    }
}

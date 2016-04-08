package LinkedList;

/**
 * Node requirements for LinkedList.
 *      - Data Variable
 *      - Next variable
 */
public class Node
{
    private int key;
    private String data;
    private Node next;

    public Node(int key, String data)
    {
        this.key = key;
        this.data = data;
        this.next = null;
    }

    public Node getNextNode()
    {
       return next;
    }

    public void setNextNode(Node node)
    {
            this.next = node;
    }

    public int getKey()
    {
        return this.key;
    }

    public String getNodeData()
    {
        return "Key " + this.key + ": " + this.data;
    }
}

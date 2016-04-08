package LinkedList;

/**
 * LinkedList requirements:
 *      - Add new Node
 *      - Remove Node
 */
public class LinkedList
{
    private Node root;
    int key = 1;

    public LinkedList(String data)
    {
        root = new Node(this.key, data);
        key++;
    }

    public void addNewNode(String data)
    {
        Node focusNode = root;
        if(focusNode == null)
        {
            focusNode = new Node(this.key, data);
        }
        else
        {
            while (true)
            {
                if(focusNode.getNextNode() == null)
                {
                    focusNode.setNextNode(new Node(this.key, data));
                    key++;
                    break;
                }
                else
                {
                    focusNode = focusNode.getNextNode();
                }
            }
        }
    }

    public void removeNode(int indexOfKey)
    {
        Node focusNode = root;
        while(true)
        {
            if (focusNode.getNextNode() == null)
            {
                break;
            }
            else
            {
                if(focusNode.getKey() == (indexOfKey - 1))
                {
                    focusNode.setNextNode(focusNode.getNextNode().getNextNode());
                    break;
                }
                else
                {
                    focusNode = focusNode.getNextNode();
                }
            }
        }
    }

    public void printLinkedList()
    {
        Node focusNode = root;
        while(true)
        {
            if(focusNode.getNextNode() == null)
            {
                System.out.println(focusNode.getNodeData());
                break;
            }
            else
            {
                System.out.println(focusNode.getNodeData());
                focusNode = focusNode.getNextNode();
            }
        }
    }

    public static void main(String[] args)
    {
        LinkedList linkedList = new LinkedList("Node 1");
        linkedList.addNewNode("Node 2");
        linkedList.addNewNode("Node 3");
        linkedList.addNewNode("Node 4");
        linkedList.addNewNode("Node 5");
        linkedList.addNewNode("Node 6");
        linkedList.addNewNode("Node 7");

        System.out.println("Beginning");
        linkedList.printLinkedList();
        System.out.println("End of first iteration");
        linkedList.removeNode(4);
        System.out.println("After remove");
        linkedList.printLinkedList();
        System.out.println("end");
    }
}

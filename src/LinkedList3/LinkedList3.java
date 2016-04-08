package LinkedList3;

/**
 * Created by Wu on 4/8/2016.
 */
public class LinkedList3
{
    Node3 root;
    int key = 1;

    public LinkedList3(String value)
    {
        root = new Node3(key, value);
        key++;
    }

    public void addNode(String value)
    {
        Node3 focusNode = root;
        if(focusNode == null)
        {
            focusNode = new Node3(key, value);
            key++;
        }
        else
        {
            while(true)
            {
                if(focusNode.getNextNode() == null)
                {
                    focusNode.setNextNode(new Node3(key, value));
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

    public void deleteNode(int key)
    {
        Node3 focusNode = root;
        if(focusNode == null)
        {
            return;
        }
        else
        {
            while(true)
            {
                if(focusNode.getNextNode() != null && focusNode.getNextNode().getNextNode() != null)
                {
                    if (key == (focusNode.getKey() + 1))
                    {
                        focusNode.setNextNode(focusNode.getNextNode().getNextNode());
                        break;
                    }
                    else
                    {
                        focusNode = focusNode.getNextNode();
                    }
                }
                else
                {
                    System.out.println("No node");
                }
            }
        }
    }

    public void printLinkedList()
    {
        Node3 focusNode = root;
        if(focusNode != null)
        {
            while(true)
            {
                System.out.println(focusNode);
                if(focusNode.getNextNode() == null)
                {
                    break;
                }
                else
                {
                    focusNode = focusNode.getNextNode();
                }
            }
        }
    }

    public static void main(String[] args)
    {
        LinkedList3 linkedList = new LinkedList3("Node 1");
        linkedList.addNode("Node 2");
        linkedList.addNode("Node 3");
        linkedList.addNode("Node 4");
        linkedList.addNode("Node 5");
        linkedList.addNode("Node 6");

        linkedList.printLinkedList();

        linkedList.deleteNode(3);

        System.out.println("\nNode 3 should be deleted. \n");

        linkedList.printLinkedList();
    }
}

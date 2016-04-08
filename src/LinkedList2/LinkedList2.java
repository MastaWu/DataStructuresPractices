package LinkedList2;

/**
 * Created by Wu on 4/6/2016.
 */
public class LinkedList2
{
    Node2 root;
    int key = 1;

    public LinkedList2(String value)
    {
        if(key != 1)
        {
            key = 1;
        }
        root = new Node2(this.key, value);
        key++;
    }

    public void addNode(String value)
    {
        if(root == null)
        {
            if(key != 1)
            {
                key = 1;
            }
            root = new Node2(this.key, value);
            key++;
        }
        else
        {
            Node2 focusNode = root;
            while(true)
            {
                if(focusNode.getNextNode() != null)
                {
                    focusNode = focusNode.getNextNode();
                }
                else
                {
                    focusNode.setNextNode(new Node2(this.key, value));
                    key++;
                    break;
                }
            }
        }
    }

    public void deleteNode(int key)
    {
        Node2 focusNode = root;
        while(true)
        {
            if(focusNode.getNextNode().getNextNode() != null)
            {
                if(focusNode.getNextNode().getKey() == key)
                {
                    focusNode.setNextNode(focusNode.getNextNode().getNextNode());
                }
                else
                {
                    focusNode = focusNode.getNextNode();
                }
            }
        }
    }

    public void printLinkedList2()
    {
        Node2 focusNode = root;
        while(true)
        {
            if(focusNode == null)
            {
                break;
            }
            else
            {
                System.out.println(focusNode);
                if(focusNode.getNextNode() != null)
                {
                    focusNode = focusNode.getNextNode();
                }
                else
                {
                    break;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        LinkedList2 linkedList = new LinkedList2("Node 1");
        linkedList.addNode("Node 2");
        linkedList.addNode("Node 3");
        linkedList.addNode("Node 4");
        linkedList.addNode("Node 5");
        linkedList.addNode("Node 6");

        linkedList.printLinkedList2();
    }
}

package Queue;

import CommonClass.Node;

public class Queue
{
    Node head;
    Node tail;

    public Queue()
    {
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public int peek()
    {
        return isEmpty() ? null : head.getAnInt();
    }

    public void enqueue(Node nodeToQueue)
    {
        Node node = nodeToQueue;

        if(tail != null)
        {
            tail.setNextNode(node);
        }
        tail = node;
        if(head == null)
        {
            head = node;
        }
    }

    public Node dequeue()
    {
        Node headNode = head;
        if(head.getNextNode() != null)
        {
            head = head.getNextNode();
        }
        if(head == null)
        {
            tail = null;
        }
        return headNode;
    }
}
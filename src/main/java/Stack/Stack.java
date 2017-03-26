package Stack;

import CommonClass.Node;

/**
 * Created by stephenwu on 3/25/17.
 */
public class Stack {
    Node top;

    public Stack()
    {
    }

    public void push(Node nodeToPush)
    {
        Node node = nodeToPush;
        node.setNextNode(top);
        top = node;

    }

    public Node pop()
    {
        Node nodeAtTop = top;
        top = top.getNextNode();
        return nodeAtTop;
    }

    public int peek()
    {
        return top.getAnInt();
    }
}

package main.CommonClass;

/**
 * DataStructuresPractices
 *
 * This is the node class used to store data.
 *
 * Stephen Wu
 * Copyright 2017
 */
public class Node
{
    int anInt;
    Node nextNode = null;
    Node leftNode = null;
    Node rightNode = null;
    Node previousNode = null;

    public Node()
    {
    }

    public void setAnInt(int anInt)
    {
        this.anInt = anInt;
    }

    public void setNextNode(Node nextNode)
    {
        this.nextNode = nextNode;
    }

    public void setLeftNode(Node leftNode)
    {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode)
    {
        this.rightNode = rightNode;
    }

    public void setPreviousNode(Node previousNode)
    {
        this.previousNode = previousNode;
    }

    public int getAnInt()
    {
        return anInt;
    }

    public Node getNextNode()
    {
        return nextNode;
    }

    public Node getLeftNode()
    {
        return leftNode;
    }

    public Node getRightNode()
    {
        return rightNode;
    }

    public Node getPreviousNode()
    {
        return previousNode;
    }
}

package main.LinkedList;

import main.CommonClass.Node;

/**
 * DataStructuresPractices
 * Stephen Wu
 * Copyright 2017
 */
public class LinkedList
{
    Node rootNode = null;

    public LinkedList()
    {
    }

    public void addToLinkedList(Node nodeToAdd)
    {
        if(rootNode != null)
        {
            Node currentNode = rootNode;
            while(currentNode.getNextNode() != null)
            {
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(nodeToAdd);
        } else {
            rootNode = nodeToAdd;
        }
    }

    public void deleteFromLinkedList(Node nodeToDelete)
    {
        Node currentNode = rootNode;
        if(currentNode != null)
        {
            if(rootNode == nodeToDelete)
            {
                rootNode = rootNode.getNextNode();
            }
            else
            {
                while(currentNode.getNextNode() != null)
                {
                    if(currentNode.getNextNode() == nodeToDelete)
                    {
                        rootNode.setNextNode(rootNode.getNextNode().getNextNode());
                    }
                    else
                    {
                        currentNode = currentNode.getNextNode();
                    }
                }
            }
        }
    }

    public Node getNode(Node requestedNode)
    {
        Node currentNode = rootNode;
        if(currentNode != null)
        {
            if (currentNode == requestedNode)
            {
                return currentNode;
            }
            else
            {
                while(currentNode.getNextNode() != null)
                {
                    if(currentNode.getNextNode() == requestedNode)
                    {
                        return currentNode.getNextNode();
                    }
                    else
                    {
                        currentNode = currentNode.getNextNode();
                    }
                }
            }
        }
        return null;
    }

    public Node getRootNode()
    {
        return rootNode;
    }
}

package test.CommonClass;

import main.CommonClass.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * DataStructuresPractices
 * Stephen Wu
 * Copyright 2017
 */
public class NodeTest
{
    @Test
    public void setNextNodeTest()
    {
        Node node = new Node();
        node.setAnInt(1);

        Node node2 = new Node();
        node2.setAnInt(2);

        Node node3 = new Node();
        node3.setAnInt(3);

        node.setNextNode(node2);
        node2.setNextNode(node3);

        assertEquals(node.getAnInt(), 1);
        assertEquals(node.getNextNode().getAnInt(), 2);
        assertEquals(node.getNextNode().getNextNode().getAnInt(), 3);
    }
}

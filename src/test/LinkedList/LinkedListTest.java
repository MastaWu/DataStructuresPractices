package test.LinkedList;

import main.CommonClass.Node;
import main.LinkedList.LinkedList;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * DataStructuresPractices
 * Stephen Wu
 * Copyright 2017
 */
public class LinkedListTest
{
    @Test
    public void testAddToLinkedList()
    {
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node();
        node1.setAnInt(1);
        linkedList.addToLinkedList(node1);

        assertEquals(node1, linkedList.getRootNode());
        assertEquals(node1.getAnInt(), linkedList.getRootNode().getAnInt());

        Node node2 = new Node();
        node2.setAnInt(2);
        linkedList.addToLinkedList(node2);
        assertEquals(node2, linkedList.getRootNode().getNextNode());
        assertEquals(node2.getAnInt(), linkedList.getRootNode().getNextNode().getAnInt());
    }

    @Test
    public void testDeleteFromLinkedList()
    {
        LinkedList linkedList = new LinkedList();
        Node node1 = new Node();
        node1.setAnInt(1);
        linkedList.addToLinkedList(node1);

        assertEquals(node1, linkedList.getRootNode());
        assertEquals(node1.getAnInt(), linkedList.getRootNode().getAnInt());

        Node node2 = new Node();
        node2.setAnInt(2);
        linkedList.addToLinkedList(node2);
        assertEquals(node2, linkedList.getRootNode().getNextNode());
        assertEquals(node2.getAnInt(), linkedList.getRootNode().getNextNode().getAnInt());

        Node node3 = new Node();
        node3.setAnInt(3);
        linkedList.addToLinkedList(node3);
        assertEquals(node3, linkedList.getRootNode().getNextNode().getNextNode());
        assertEquals(node3.getAnInt(), linkedList.getRootNode().getNextNode().getNextNode().getAnInt());

        linkedList.deleteFromLinkedList(node2);
        assertNotEquals(node2, linkedList.getRootNode().getNextNode());
        assertNotEquals(node2.getAnInt(), linkedList.getRootNode().getNextNode().getAnInt());

    }
}

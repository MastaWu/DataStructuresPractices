package Queue;

import CommonClass.Node;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by stephenwu on 3/25/17.
 */
public class QueueTest {

    @Test
    public void testEnqueue()
    {
        Queue queue = new Queue();
        Node node1 = new Node();
        node1.setAnInt(1);
        Node node2 = new Node();
        node2.setAnInt(2);
        Node node3 = new Node();
        node3.setAnInt(3);

        queue.enqueue(node1);
        assertEquals(queue.dequeue(), node1);
    }
}

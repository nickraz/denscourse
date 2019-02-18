import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.LinkedList;

public class QueueAndStackTest {
    private LinkedList<Integer> linkedList = new LinkedList<>();
    private Stack<Integer> stack = new Stack<>();
    private Queue<Integer> queue = new Queue<>();

    @Before
    public void init(){
        linkedList.push(1);
        linkedList.push(2);
        linkedList.push(3);
        linkedList.push(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
    }

    @Test
    public void idendityStack(){
        for (int i = 0; i < linkedList.size(); i++) {
            Assert.assertEquals(linkedList.pop(), stack.pop());
        }
    }

    @Test
    public void idendityQueue(){
        for (int i = 0; i < linkedList.size(); i++) {
            Assert.assertEquals(linkedList.pop(), queue.dequeue());
        }
    }

    @Test
    public void linkedPoll(){
        for (int i = 0; i < linkedList.size(); i++) {
            Assert.assertEquals(linkedList.poll(), stack.poll());
        }
    }
}

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTest {
    LinkedList<Integer> linkedList = new LinkedList<>();
    MyLinkedList<Integer> myLinkedList = new MyLinkedList();

    @Before
    public void init() {
        Collections.addAll(linkedList, 1, 2, 3, 4, 5, 6, 7);
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);
        myLinkedList.add(6);
        myLinkedList.add(7);
    }

    @Test
    public void afterAdd(){
        MyLinkedList myLinkedList = new MyLinkedList();
        for (int i = 0; i < myLinkedList.getSize(); i++) {
            Assert.assertEquals(myLinkedList.get(i), linkedList.get(i));
        }
    }

    @Test
    public void afterPop(){
        Assert.assertEquals(linkedList.poll(), myLinkedList.poll());
    }

    @Test
    public void afterPopAndPoll(){
        Assert.assertEquals(linkedList.pop(), myLinkedList.pop());
        Assert.assertEquals(linkedList.poll(), myLinkedList.poll());
        Assert.assertEquals(linkedList.remove(0), myLinkedList.pop());
        Assert.assertEquals(linkedList.pop(), myLinkedList.remove(0));
        Assert.assertEquals(linkedList.size(), myLinkedList.getSize());
        for (int i = 0; i < myLinkedList.getSize(); i++) {
            Assert.assertEquals(myLinkedList.get(i), linkedList.get(i));
        }
    }

}

public class Queue<T> {
    private MyLinkedList<T> linkedList = new MyLinkedList<>();

    public T dequeue() {
        return linkedList.dequeue();
    }

    public void enqueue(T val) {
        linkedList.enqueue(val);
    }

    public void offer(T val) {
        linkedList.offer(val);
    }
}

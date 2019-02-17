public class Stack<T> {
    private MyLinkedList<T> linkedList = new MyLinkedList<>();

    public T poll() {
        return linkedList.poll();
    }

    public T pop() {
        return linkedList.pop();
    }

    public void push(T val) {
        linkedList.push(val);
    }
}

public class MyLinkedList<E> {

    private Node<E> first;
    private int size;

    public int getSize() {
        return size;
    }

    public E poll(){
        Node<E> node = getNode(0);
        return node.date;
    }

    public E pop(){
        if(size == 0){
            throw new IndexOutOfBoundsException();
        }
        E result = first.date;
        if(size == 1){
            first = null;
        } else {
            first = first.next;
            first.prev = null;
        }
        size--;
        return result;
    }

    public void push(E val){
        if(size == 0){
            first = new Node<>(val);
        } else {
            Node<E> temp = first;
            first = new Node<>(val);
            first.next = temp;
            temp.prev = first;
        }
        size++;
    }

    public void add(E val){
        if(first == null){
            first = new Node<>(val);
        } else {
            Node<E> node = first;
            while (node.next!=null){
                node = node.next;
            }
            node.next = new Node<>(val);
            node.next.prev = node;
        }
        size++;
    }

    private Node<E> getNode(int index){
        if(index >= size || size == 0){
            throw new IndexOutOfBoundsException();
        }
        Node<E> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public E get(int index){
        Node<E> node = getNode(index);
        return node.date;
    }

    public E remove(int index){
        Node<E> node = getNode(index);
        E result = node.date;
        if(node == first){
            if(node.next == null){
                node = null;
            } else {
                node.next.prev = null;
                first = first.next;
            }
        } else if(index == size - 1){
            node.prev.next = null;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        size--;
        return node == null ? result : node.date;
    }

    private static class Node<E> {
        private E date;
        private Node<E> next;
        private Node<E> prev;

        public Node(E date) {
            this.date = date;
        }
    }
}

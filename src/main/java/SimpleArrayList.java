public class SimpleArrayList<T> {
    private int size;
    private Node<T> first;

    public int getSize() {
        return size;
    }

    /**
     * Добавление элемента в голову
     * @param date Добавляемый элемент
     */
    public void add(T date){
        Node<T> newLink = new Node<>(date);
        newLink.next = this.first;
        this.first = newLink;
        size++;
    }

    public T delete(){
        Node<T> temp = this.first;
        T retVal = null;
        if(size > 0) {
            while (temp.next != null) {
                if (temp.next.next == null) {
                    retVal = temp.next.date;
                    temp.next = null;
                    size--;
                    break;
                } else {
                    temp = temp.next;
                }
            }
        }
        return retVal;
    }

    public T get(int index){
        Node<T> result = this.first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }
        return result.date;
    }

    private static class Node<E> {
        private E date;
        private Node<E> next;

        public Node(E date) {
            this.date = date;
        }
    }
}

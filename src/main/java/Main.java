public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.push(4);
        linkedList.offer(5);
        linkedList.enqueue(6);

        System.out.println("linkedList size = " + linkedList.getSize());
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("dequeue = " + linkedList.dequeue());

        System.out.println("linkedList size = " + linkedList.getSize());
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("--------------C");
        while (linkedList.getSize() > 0){
            System.out.println(linkedList.dequeue());
        }
    }

}

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.push(4);

        System.out.println("linkedList size = " + linkedList.getSize());
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("pop = " + linkedList.pop());

        System.out.println("linkedList size = " + linkedList.getSize());
        for (int i = 0; i < linkedList.getSize(); i++) {
            System.out.println(linkedList.get(i));
        }

        System.out.println("poll " + linkedList.poll());
    }

}

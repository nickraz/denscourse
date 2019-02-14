public class Main {

    public static void main(String[] args) {
        DynamicArray<Integer> dynamicArray = new DynamicArray<>(2);
        dynamicArray.add(1);
        dynamicArray.add(2);
        dynamicArray.add(3);
        dynamicArray.add(4);
        dynamicArray.add(5);

        dynamicArray.forEach(System.out::println);
    }

}

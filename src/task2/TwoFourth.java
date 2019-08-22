package task2;


import java.util.*;

public class TwoFourth {

    public static void main(String[] args) {

        System.out.println("\nTwoFourth");

        System.out.println("\nArrayList");
        testList(new ArrayList<>());

        System.out.println("\nLinkedList");
        testList(new LinkedList<>());

    }

    private static void testList(List<String> linkedList) {
        addCountries(linkedList);
        sortAndPrint(linkedList);
        shuffleAndPrint(linkedList);
    }

    private static void sortAndPrint(List<String> list) {
        Collections.sort(list);
        System.out.println("Countries: " + list);
    }

    private static void shuffleAndPrint(List<String> list) {
        int count = 5;
        for (int i = 0; i < count; i++) {
            Collections.shuffle(list);
            System.out.println("Shuffled countries #" + i + ": " + list);
        }
    }

    private static List<String> addCountries(List<String> list) {
        list.add("Ukraine");
        list.add("Sweden");
        list.add("France");
        list.add("Belgium");
        list.add("Italy");
        list.add("Poland");
        return list;
    }

}

package task2;


import java.util.*;

public class TwoThird {
    public static void main(String[] args) {

        System.out.println("\nTwoThird");

        // Modify Exercise 2 so you use an Iterator to move through the List while calling hop( ).
        List<Mouse> mice = new ArrayList<>();
        mice.add(new Mouse(1));
        mice.add(new Mouse(2));
        mice.add(new Mouse(3));
        mice.add(new Mouse(4));

        Iterator<Mouse> iterator = mice.iterator();
        while (iterator.hasNext()) {
            Mouse mouse = iterator.next();
            mouse.hop();
        }

        /* Take the Mouse class in Exercise 2 and put it into a Map instead, associating the name of the Mouse
         * as a String (the key) for each Mouse (the value) you put in the table. Get an Iterator for the keySet( )
         * and use it to move through the Map, looking up the Mouse for each key and printing out the key and
         * telling the mouse to hop( ).
         */

        Map<String, Mouse> mouseMap = new HashMap<>();
        mouseMap.put("Mali", new Mouse(1));
        mouseMap.put("Kurt", new Mouse(2));

        Iterator<String> keys = mouseMap.keySet().iterator();
        while (keys.hasNext()) {
            String key = keys.next();
            System.out.println("Key = " + key);
            mouseMap.get(key).hop();
        }

    }

}

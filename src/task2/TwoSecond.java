package task2;


import java.util.ArrayList;
import java.util.List;

public class TwoSecond {
    public static void main(String[] args) {

        System.out.println("\nTwoSecond");

        List<Mouse> mice = new ArrayList<>();
        mice.add(new Mouse(1));
        mice.add(new Mouse(2));
        mice.add(new Mouse(3));
        mice.add(new Mouse(4));

        for (int i = 0; i < mice.size(); i++) {
            mice.get(i).hop();
        }
    }

}

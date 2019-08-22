package task1;

public class OneThird {
    public static void main(String[] args) {
        System.out.println("\nOneThird");

        Integer d = null;
        try {
            d.toString();
        } catch (Exception e) {
            System.out.println("Caught " + e.getClass().getSimpleName());
            e.printStackTrace();
        }
    }

}

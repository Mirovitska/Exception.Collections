package task1;

public class OneFirst {
    public static void main(String[] args) {

        System.out.println("\nOneFirst");

        try {
            throw new FirstException("This is an exception message.");
        } catch (FirstException e) {
            System.out.println("Caught " + e.getClass().getSimpleName() + ": " + e.getMessage());

        } finally {
            System.out.println("I am in finally clause.");
        }
    }

}

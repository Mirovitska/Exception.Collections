package task1;

public class OneFourth {
    public static void main(String[] args) {
        System.out.println("\nOneFourth");

        int q = 10;
        while (true) {
            try {
                int[] arraySymb = {1, 2, 3, 4, 5};
                System.out.println("The last element(index " + q + ") in the array is: " + arraySymb[q]);
                break;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(q + " is too big!");
                q--;
            }
        }
    }
}

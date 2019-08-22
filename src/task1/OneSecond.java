package task1;

public class OneSecond {
    public static void main(String[] args) {
        System.out.println("\nOneSecond");

        try {
            throw new MyException("This is my message string.");
        } catch (MyException e) {
            System.out.println("Error found: " + e.getClass().getSimpleName());
            e.display();
        }
    }

    static class MyException extends Exception {
        private String myMessage;

        MyException(String myMessage) {
            this.myMessage = myMessage;
        }

        public void display() {
            System.out.println("My message = " + myMessage);
        }
    }

}

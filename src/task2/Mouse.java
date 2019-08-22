package task2;

public class Mouse {

    private int mouseNumber;

    Mouse(int mouseNumber) {
        this.mouseNumber = mouseNumber;
    }

    public void hop() {
        System.out.println("Hopping mouse " + mouseNumber);
    }

}
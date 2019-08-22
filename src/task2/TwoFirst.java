package task2;


import util.Arrays2;

public class TwoFirst {

    public static void main(String[] args) {

        System.out.println("\nTwoFirst");

        double[] r = new double[10];
        Arrays2.fill(r, new Arrays2.RandDoubleGenerator());
        Arrays2.print(r);

    }



}

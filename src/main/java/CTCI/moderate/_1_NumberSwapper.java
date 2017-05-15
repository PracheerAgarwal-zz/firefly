package CTCI.moderate;

/**
 * Created by pracheer.agarwal on 5/15/17.
 */
public class _1_NumberSwapper {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
}

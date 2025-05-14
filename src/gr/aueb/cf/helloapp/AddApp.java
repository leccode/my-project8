package gr.aueb.cf.helloapp;

/**
 * New feature to add 2 integers.
 * Add method is called in main.
 *
 * @since 14/05/25
 * @author Constantine Lekkos
 */
public class AddApp {
    public static void main(String[] args) {
        System.out.println(add(3, 5));
        System.out.printf("%4d", add(7, 2));
    }

    /**
     * Add method of 2 integers.
     * @param a First integer.
     * @param b Second integer.
     * @return An integer is returned as a result.
     */
    public static int add(int a, int b) {
        return a + b;
    }
}

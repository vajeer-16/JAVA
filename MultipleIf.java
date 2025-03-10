package Loops;

public class MultipleIf {
    public static void main(String[] args) {

        int a = 30, b = 60, c = 50;

        if (a > b && a > c) {
            System.out.println(a + " is the Largest Number");

        }

        else if (b > a && b > c) {
            System.out.println(b + " is the Largest Number");
        }

        else {
            System.out.println(c + " is the Largest Number");
        }
    }
}


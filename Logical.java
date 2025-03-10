public class Logical {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 4;

        System.out.println(a > b && a > c);

        System.out.println(a < b && a < c);
        System.out.println(a > b && a < c);


        System.out.println(a > b || a > c);
        System.out.println(a < b || a < c);
        System.out.println(a < b || a > c);


        System.out.println(!(a > b));
        System.out.println(!(a < b));
    }
}


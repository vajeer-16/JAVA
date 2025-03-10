public class IncrementDecrement {
    static void preIncrement(int a, int b) {
        int d;                  
        d = b + (++a);          
        System.out.println(" after Pre-Increment  : " + a + "," + d);
    }

    static void postIncrement(int a, int b) {
        int d;                  
        d = b + (a++);          
        System.out.println(" after Post-Increment  : " + a + "," + d);
    }


    static void preDecrement(int a, int b) {
        int d;                  
        d = b + (--a);          
        System.out.println(" after Pre-Decrement : " + a + "," + d);
    }

    static void postDecrement(int a, int b) {
        int d;                  
        d = b + (a--);          
        System.out.println(" after Post-Decrement  : " + a + "," + d);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        preIncrement(a, b);
        postIncrement(a, b);
        preDecrement(a, b);
        postDecrement(a, b);
    }
}


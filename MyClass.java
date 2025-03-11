public class MyClass {
    int x;
    int y;

   
    public MyClass() {
        this(10, 20);
        System.out.println("No-argument constructor called");
    }

   
    public MyClass(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Argument constructor called");
    }

    public void display() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}



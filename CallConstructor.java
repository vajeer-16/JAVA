public class CallConstructor {
    public class MyClass {
        int x;
        int y;
    
        // Constructor 1
        public MyClass() {
            System.out.println("Constructor 1 called");
        }
    
        // Constructor 2
        public MyClass(int x) {
            this(); // Calling Constructor 1 using this()
            this.x = x;
            System.out.println("Constructor 2 called");
        }
    
        // Constructor 3
        public MyClass(int x, int y) {
            this(x); // Calling Constructor 2 using this()
            this.y = y;
            System.out.println("Constructor 3 called");
        }
    
        public void display() {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    
        public static void main(String[] args) {
            MyClass obj = new MyClass(10, 20);
            obj.display();
        }
    }
    
    
}

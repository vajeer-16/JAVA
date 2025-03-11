public class FieldWithoutObject {
    public class MyClass {
        int x;
        String y;
    
        public MyClass(int x, String y) {
            this.x = x;
            this.y = y;
        }
    
        void printFields() {
            System.out.println("x = " + this.x);
            System.out.println("y = " + this.y);
        }
    
        public static void main(String[] args) {
            MyClass obj = new MyClass(10, "Hello");
            obj.printFields();
        }
    }
     
}

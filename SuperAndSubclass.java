
    class A {
        public void printA() {
            System.out.println("Class A");
        }
    }
    
    
    class B extends A {
        public void printB() {
            System.out.println("Class B");
        }
    }
    
    
    class C extends B {
        public void printC() {
            System.out.println("Class C");
        }
    
    
    
        public static void main(String[] args) {
           
            C obj = new C();
    
           
            obj.printA();
            obj.printB();
            obj.printC();
        }
    }


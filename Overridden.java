
  public static void Main (String[] args){
class A {
    void display() {
        System.out.println("Class A");
    }
}


class B extends A {
    @Override
    void display() {
        System.out.println("Class B");
    }
}

class C extends A {
    @Override
    void display() {
        System.out.println("Class C");
    }


    public static void main(String[] args) {
        
        B b = new B();
        C c = new C();


        A aRef1 = b; 
        A aRef2 = c; 

        
        aRef1.display(); 
        aRef2.display(); 
    }
}
  }




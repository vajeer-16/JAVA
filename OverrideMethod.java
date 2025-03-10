public class OverrideMethod {
    class A {
        void methodA1() {
          System.out.println("Method A1");
        }
      
        void methodA2() {
          System.out.println("Method A2");
        }
      
        void overrideMethod() {
          System.out.println("Override method in Class A");
        }
      }
      class B extends A {
        void methodB1() {
          System.out.println("Method B1");
        }
      
        void methodB2() {
          System.out.println("Method B2");
        }
        void overrideMethod() {
          System.out.println("Override method in Class B");
        }
      }
    class C extends A {
        void methodC1() {
          System.out.println("Method C1");
        }
      
        void methodC2() {
          System.out.println("Method C2");
        }
    
        void overrideMethod() {
          System.out.println("Override method in Class C");
        }
      }
}

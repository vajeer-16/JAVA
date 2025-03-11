public class ThisSuper {
    class Animal {
        void eat() {
            System.out.println("Eating...");
        }
    }
    
    class Dog extends Animal {
        void eat() {
            super.eat(); 
            System.out.println("Dog is eating...");
        }
    
        void bark() {
            System.out.println("Barking...");
            this.eat();
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Dog dog = new Animal();
            dog.bark();
        }
    }
    
    
    
}

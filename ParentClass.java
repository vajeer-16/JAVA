public class ParentClass {
   
class Animal {
    String name;

   
    public Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println(name + " is eating...");
    }
}


class Dog extends Animal {
   
    public Dog(String name) {
        super(name); 
        System.out.println("Dog constructor called");
    }

    void bark() {
        System.out.println("Barking...");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Max");
        dog.eat();
        dog.bark();
    }
}

}

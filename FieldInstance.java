public class FieldInstance {
    // Parent class
class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Child class
class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age); // Calling the Animal constructor
        this.breed = breed;
    }

    void printParentFields() {
        super.display(); // Calling the display() method in Animal
        System.out.println("Breed: " + breed);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", 3, "Golden Retriever");
        dog.printParentFields();
    }
}

}

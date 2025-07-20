// Parent class
class Animal {
    void makeSound() {
        System.out.println("Some animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Animal myAnimal;

        myAnimal = new Dog();  // Dog IS an Animal
        myAnimal.makeSound();  // Output: Dog barks

        myAnimal = new Cat();  // Cat IS also an Animal
        myAnimal.makeSound();  // Output: Cat meows
    }
}

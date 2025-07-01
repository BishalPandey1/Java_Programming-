// Abstract class
abstract class Animal {
    // Abstract method
    abstract void makeSound();
}

// Dog class extending Animal
class Dog extends Animal {
    // Implementation of makeSound()
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Cat class extending Animal
class Cat extends Animal {
    // Implementation of makeSound()
    @Override
    void makeSound() {
        System.out.println("Meow! Meow!");
    }
}


public class AbstractClassExample {
    public static void main(String[] args) {
        // Create objects of Dog and Cat
        Animal myDog = new Dog();
        Animal myCat = new Cat();


        myDog.makeSound();
        myCat.makeSound();
    }
}



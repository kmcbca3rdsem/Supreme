import javafx.beans.binding.DoubleBinding;

abstract public class Animal {
    abstract void makeSound();
    Animal dog = new Dog();
    Animal cat = new Cat();
    dog.makeSound();
    dog.info();

    cat.makeSound();
    cat.info();
    
    }
}

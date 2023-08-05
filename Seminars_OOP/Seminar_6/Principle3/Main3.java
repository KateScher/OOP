package Seminars_OOP.Seminar_6.Principle3;

abstract class Animal {
  public abstract void makeSound();
}

class Dog extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Dog barks.");
  }

  public void fetch() {
    System.out.println("Dog fetches.");
  }
}

class Cat extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Cat meows.");
  }

  public void scratch() {
    System.out.println("Cat scratches.");
  }
}

public class Main3 {
  public static void main(String[] args) {
    Dog dog = new Dog();
    Cat cat = new Cat();

    dog.makeSound();
    cat.makeSound();
  }
}
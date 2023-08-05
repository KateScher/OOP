package Homeworks_OOP.Homework_6.ISP_Principle;

interface AnimalAction {
  void fetch();

  void scratch();
}

abstract class Animal {
  public abstract void makeSound();
}

// Метод scratch() не используется, но имплементируется
class Dog extends Animal implements AnimalAction {
  @Override
  public void makeSound() {
    System.out.println("Dog barks.");
  }

  @Override
  public void fetch() {
    System.out.println("Dog fetches.");
  }

  @Override
  public void scratch() {
    // No actions
  }
}

// Метод fetch() не используется, но имплементируется
class Cat extends Animal implements AnimalAction {
  @Override
  public void makeSound() {
    System.out.println("Cat meows.");
  }

  @Override
  public void fetch() {
    // No actions
  }

  @Override
  public void scratch() {
    System.out.println("Cat scratches.");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal animal1 = new Dog();
    Animal animal2 = new Cat();

    animal1.makeSound(); // Вывод: Dog barks.
    animal2.makeSound(); // Вывод: Cat meows.
  }
}
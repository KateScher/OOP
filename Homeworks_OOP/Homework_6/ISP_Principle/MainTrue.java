package Homeworks_OOP.Homework_6.ISP_Principle;

// интерфейс AnimalActions разложен на отдельные уровни
interface Fetchable {
  void fetch();
}

interface Scratchable {
  void scratch();
}

abstract class Animal {
  public abstract void makeSound();
}

// Интерфейс Fetchable не используется, следовательно, не имплементируется
class Dog extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Dog barks.");
  }
}

// имплементируется только необходимый интерфейс
class Cat extends Animal implements Scratchable {
  @Override
  public void makeSound() {
    System.out.println("Cat meows.");
  }

  @Override
  public void scratch() {
    System.out.println("Cat scratches.");
  }
}

public class MainTrue {
  public static void main(String[] args) {
    Animal animal1 = new Dog();
    Animal animal2 = new Cat();

    animal1.makeSound(); // Вывод: Dog barks.
    animal2.makeSound(); // Вывод: Cat meows.

    if (animal2 instanceof Scratchable) {
      Scratchable cat = (Scratchable) animal2;
      cat.scratch(); // Вывод: Cat scratches.
    }
  }
}
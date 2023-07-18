class Animal {
  public void makeSound() {
    System.out.println("The animal makes a sound");
  }
}

class Dog extends Animal {
  @Override
  public void makeSound() {
    System.out.println("The dog barks");
  }
}

class Cat extends Animal {
  @Override
  public void makeSound() {
    System.out.println("The cat meows");
  }
}

//public class PolymorphismExample {
//  public static void main(String[] args) {
//    Animal animal1 = new Dog();
//    Animal animal2 = new Cat();
//
//    animal1.makeSound(); // Вывод: "The dog barks"
//    animal2.makeSound(); // Вывод: "The cat meows"
//  }
//}
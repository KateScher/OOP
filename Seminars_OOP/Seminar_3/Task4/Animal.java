package Seminars_OOP.Seminar_3.Task4;

import java.util.ArrayList;
import java.util.List;

// Пример сортировки списка животных по возрасту с использованием лямбда-выражения в Компараторе

public class Animal implements Comparable<Animal> {
  private String name;
  private int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  @Override
  public String toString() {
    return "Animal{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public int compareTo(Animal otherAnimal) {
    return this.age - otherAnimal.age;
  }

  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();
    animals.add(new Animal("Cat", 5));
    animals.add(new Animal("Dog", 3));
    animals.add(new Animal("Elephant", 10));
    animals.add(new Animal("Lion", 7));

    // Используем лямбда-выражение в компараторе для сортировки по возврасту:
    // animals.sort((animal1, animal2) -> animal1.getAge() - animal2.getAge());
    // или следующее выражение с добавлением CompareTo в 33-34 строках:

    animals.sort(null);

    // Выводим отсортированный список животных
    for (Animal animal : animals) {
      System.out.println(animal);
    }
  }
}

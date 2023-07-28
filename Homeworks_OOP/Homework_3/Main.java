package Homeworks_OOP.Homework_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Market market = new Market();
    market.addPerson("Sergey", Arrays.asList("Крем Avene", "Тоник для лица Breeze"), 1200 + 700);
    market.addPerson("Tanya", Arrays.asList("Гель для душа Svezhest"), 500);
    market.addPerson("Ivan", Arrays.asList("Порошок стиральный EDD", "Парфюм WERA", "Шампунь GTR"),
        300 + 670 + 1500);
    System.out.println(
        "Выбирите тип сортировки заказов: \n1.По колличеству товаров покупателя \n2.По цене товаров покпателя");
    Scanner scanner = new Scanner(System.in);
    int choice = scanner.nextInt();
    if (choice == 1) {
      Comparator<Person> personComparator = Comparator.comparingInt(person -> person.getProducts().size());
      market.sortByProductCount(personComparator);
    } else if (choice == 2) {
      Comparator<Person> personComparator = Comparator.comparingInt(Person::getPrice);
      market.sortByPrice(personComparator);
    } else {
      System.out.println("Такого варианта сортировки не существует");
    }

    for (int i = market.size(); i >= 0; i--) {
      market.update();

      if (market.size() == 0) {
        market.update();
        break;
      } else {

        System.out.println("В очереди " + market.size() + " человек(а)");
        System.out.println();
      }

      try {
        Thread.sleep(3000);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }

    }

  }
}

package Homeworks_OOP.Homework_6.SOLID_Principles;

/* Реализовать 5-ый принцип ООП __ 2.Взять реализованный код в рамках семинара 3, 4 или 5 и продемонстрировать применение принципов, усвоенных на семинаре. Нужно в проекте прокомментировать участки кода, которые рефакторим, какой принцип применяем и почему.
 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {

    List<Rectangle> rectangles = new ArrayList<>();

    rectangles.add(new Rectangle(22.3, 17.1));
    rectangles.add(new Rectangle(14.5, 9.3));
    rectangles.add(new Rectangle(5.7, 20.8));
    rectangles.add(new Rectangle(7.4, 3.1));
    rectangles.add(new Rectangle(33.1, 21.2));
    rectangles.add(new Rectangle(9.4, 12.5));
    rectangles.add(new Rectangle(15.2, 48.2));
    rectangles.add(new Rectangle(48.0, 25.4));

    System.out.println("\nНеупорядоченный список прямоугольников:");
    for (Rectangle rectangle : rectangles) {
      rectangle.printRes();
    }

    Comparator<Rectangle> areaComparator = (rectangle1,
        rectangle2) -> (int) (rectangle1.getArea() - rectangle2.getArea());

    rectangles.sort(areaComparator);

    System.out.println("\nУпорядоченный по возрастанию площади прямоугольников список :");
    for (Rectangle rectangle : rectangles) {
      rectangle.printRes();
    }
  }
}
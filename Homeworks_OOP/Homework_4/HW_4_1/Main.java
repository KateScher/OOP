/*Задача 1 : Напишите обобщенный метод printElement, который принимает один параметр типа T и выводит его на консоль.
В этом примере мы объявляем обобщенный метод printElement, который принимает один параметр типа T. Мы просто выводим этот элемент на консоль с помощью метода System.out.println().
В методе main мы вызываем printElement с различными типами данных: целое число (Integer), строку (String) и число с плавающей запятой (Double). Компилятор автоматически выводит тип параметра T на основе переданных аргументов.
Таким образом, обобщенные методы позволяют нам писать код, который может работать с различными типами данных, обеспечивая простоту и гибкость использования.*/

package Homeworks_OOP.Homework_4.HW_4_1;

public class Main {
  public static void main(String[] args) {
    printElement("Hello");
    printElement(4323423);
    printElement(323.232);
  }

  public static <T> void printElement(T element) {
    System.out.println(element);
  }
}
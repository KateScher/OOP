package Seminars_OOP.Seminar_3.Task3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main2 {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

    // Используем компаратор для сортировки в порядке возрастания
    // Используется лямбда-выражение для компактности кода (можно
    // использовать Компаратор, но код будет длиннее, см. в Main.java)

    numbers.sort((num1, num2) -> num1 - num2);

    System.out.println(numbers);
  }

}

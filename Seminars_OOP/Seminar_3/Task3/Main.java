package Seminars_OOP.Seminar_3.Task3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

    // Используем компаратор для сортировки в порядке возрастания

    // ниже анонимный класс, вместо него можно использовать лямбда-выражение
    // для создания Компаратора для более компактного кода (см. в Main2.java)
    numbers.sort(new Comparator<Integer>() {
      @Override
      public int compare(Integer num1, Integer num2) {
        return num1 - num2;
      }
    });

    System.out.println(numbers);
  }

}

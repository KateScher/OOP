package Seminars_OOP.Seminar_3;

// Функциональный интерфейс нужен для работы с лямбда-выражением
// Реализуем наш интерфейс,
public class Task1 {
  public static void main(String[] args) {
    IValue value; // ссылка на экз.
    value = () -> 98.6; // назначили реализацию
    System.out.println(value.getValue()); // Создали экземпляр нашего интерфейса

    IValue2 value2 = (x) -> 100.0 / x;
    IValue2 value2_1 = (y) -> 24.0 * y - 5.5;

    System.out.println(value2.getValue(5.0));
    System.out.println(value2_1.getValue(8.0));

    IValue3 value3 = (a, b) -> { // это блочное лямбда-выражение, как метод
      double result = 1.0;
      // реализация
      // реализация
      // реализация

      return result;
    };
  }
}

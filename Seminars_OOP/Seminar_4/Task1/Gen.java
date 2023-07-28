package Seminars_OOP.Seminar_4.Task1;

public class Gen<E> {

  E ob;

  public Gen(E o) {
    ob = o;
  }

  public E getOb() {
    return ob;
  }

  public void showType() {
    System.out.println("Тип объекта " + ob.getClass().getName());
  }
}

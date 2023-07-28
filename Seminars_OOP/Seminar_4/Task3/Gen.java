package Seminars_OOP.Seminar_4.Task3;

class Gen<T> {

  T ob;

  public Gen(T o) {
    ob = o;
  }
}

class UseTest {

  // Использование ограниченных шаблонов аргументов
  // super или extends
  static void test(Gen<? super B> a) {
    //
  }

  public static void main(String[] args) {
    A a = new A();
    A b = new B();
    A c = new C();
    A d = new D();

    Gen<A> ga = new Gen<>(a);
    Gen<B> gb = new Gen<>(b);
    Gen<C> gc = new Gen<>(c);
    Gen<D> gd = new Gen<>(d);

    test(ga);
    test(gb);
    test(gc);
    test(gd);

  }
}
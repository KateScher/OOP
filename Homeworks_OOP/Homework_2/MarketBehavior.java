package Homeworks_OOP.Homework_2;

public interface MarketBehavior {
  void acceptToMarket(Buyer actor);

  void releaseFromMarket(Buyer actor);

  void update();
}

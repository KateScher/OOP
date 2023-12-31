package Homeworks_OOP.Homework_2;

/*Реализовать класс Market и все его обязательные методы. Этот класс должен реализовывать методы из интерфейса QueueBehaviour, которые имитируют работу очереди. Кроме того, класс должен содержать методы, соответствующие интерфейсу MarketBehaviour, которые добавляют и удаляют людей из очереди, а также метод update, который обновляет состояние магазина путем принятия и отдачи заказов.*/

public class Main {
  public static void main(String[] args) {

    Human hm = new Human();
    hm.name = "Mister Pitkin";

    Market market = new Market();

    market.acceptToMarket(hm);
    market.takeInQueue(hm);
    market.giveOrder();
    market.takeOrder();
    market.releaseFromQueue();
    market.releaseFromMarket(hm);
    market.update();

  }
}

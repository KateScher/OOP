package Homeworks_OOP.Homework_2;

public interface QueueBehavior {
  void takeInQueue(Buyer actor);

  void takeOrder();

  void giveOrder();

  void releaseFromQueue();
}
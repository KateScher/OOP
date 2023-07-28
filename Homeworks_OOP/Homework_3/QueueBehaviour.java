package Homeworks_OOP.Homework_3;

interface QueueBehaviour {
  void enqueue(Person person);

  Person dequeue();

  int size();
}
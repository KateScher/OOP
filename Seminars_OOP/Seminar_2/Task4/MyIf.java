package Seminar_2.Task4;

public interface MyIf {

  int getUserID();

  default int getAdminID() {
    return 1;
  }
}
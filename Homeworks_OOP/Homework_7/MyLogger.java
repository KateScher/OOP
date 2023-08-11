package Homeworks_OOP.Homework_7;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
  private Logger logger;

  public MyLogger(String fileName) {
    logger = Logger.getLogger("MyLog");

    try {
      FileHandler fh = new FileHandler(
          "C:\\Users\\Екатерина\\GB\\ООП\\OOP\\Homeworks_OOP\\Homework_7\\MyLogFile.log");
      fh.setFormatter(new SimpleFormatter());
      logger.addHandler(fh);
      logger.setLevel(Level.ALL);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void info(String message) {
    logger.info("My first log");
  }

  public void warning(String message) {
    logger.warning(message);
  }

}
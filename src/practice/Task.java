package practice;

import java.time.LocalDate;

public class Task {
  LocalDate date;
  String content;

  public Task(LocalDate date, String content) {
    this.date = date;
    this.content = content;
  }

  @Override
  public String toString() {
    return date + " " + content;
  }
}

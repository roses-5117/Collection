package practice;

import java.time.LocalDate;

public class Task {
  private LocalDate date;
  private String content;

  public Task(LocalDate date, String content) {
    this.date = date;
    this.content = content;
  }
  
//ゲッター（他のクラスから date を読み取るために必要）
 public LocalDate getDate() {
   return this.date;
 }
 
 public String getContent() {
	   return this.content;
	 }

  @Override
  public String toString() {
    return this.date + this.content;
  }
}

package oop;

public class Student2 {
  String name;
  int englishScore;
  int mathScore;

  void setData(String n) {
    name = n;
  }

  // オーバーロード
  void setData(String n, int e, int m) {
    name = n;
    englishScore = e;
    mathScore = m;
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("English Score: " + englishScore);
    System.out.println("Math Score: " + mathScore);
  }
}

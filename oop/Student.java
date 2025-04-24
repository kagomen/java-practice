package oop;

public class Student {
  String name;
  int englishScore;
  int mathScore;

  void display() {
    System.out.println("Name: " + name);
    System.out.println("English: " + englishScore);
    System.out.println("Math: " + mathScore);
  }

  void setScore(int english, int math) {
    englishScore = english;
    mathScore = math;
  }

  double getAvg() {
    return (englishScore + mathScore) / 2.0;
  }
}

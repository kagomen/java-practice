package oop;

public class Student5 {
  private String name;
  private int score;

  public Student5(String n) {
    name = n;
  }

  public void setScore(int s) {
    if (0 > s || 100 < s) {
      System.out.println("invalid score: " + name);
      score = 0;
    } else {
      score = s;
    }
  }

  void display() {
    System.out.println(name + "'s score: " + score);
  }
}

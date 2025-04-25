package oop2;

public class Student2 extends Person {
  private int stuNo;

  public void setStuNo(int n) {
    stuNo = n;
  }

  // オーバーライド
  public void display() {
    System.out.println("Name: " + getName());
    System.out.println("Student Number: " + stuNo);
  }
}

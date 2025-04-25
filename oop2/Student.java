package oop2;

public class Student extends Person {
  private int stuNo;

  public void setStuNo(int n) {
    stuNo = n;
  }

  public void displayStuNo() {
    System.out.println("Student Number: " + stuNo);
  }
}

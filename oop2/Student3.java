package oop2;

public class Student3 extends Person3 {
  private int stuNo;

  public Student3() {
    this("no name", 0);
  }

  public Student3(String name) {
    this(name, 0);
  }

  public Student3(String name, int stuNo) {
    super(name);
    this.stuNo = stuNo;
  }

  public void display() {
    super.display();
    System.out.println("Studen Number: " + stuNo);
  }
}

package oop2;

public final class Student4 extends Person3 {
  final int BASE_NO = 1000;
  private int no;

  public Student4(String name, int no) {
    super(name);
    this.no = no;
  }

  public void display() {
    super.display();
    System.out.println("Student Number: " + (BASE_NO + no));
  }
}

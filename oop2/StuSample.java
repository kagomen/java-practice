package oop2;

public class StuSample {
  public static void main(String[] args) {
    Student stu = new Student();

    // スーパークラスのメソッド
    stu.setName("kagome");
    stu.display();

    // サブクラスのメソッド
    stu.setStuNo(2525);
    stu.displayStuNo();
  }
}

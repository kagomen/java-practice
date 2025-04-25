package oop;

public class StudentSample5 {
  public static void main(String[] args) {
    Student5 stu1 = new Student5("kagome");
    stu1.setScore(80);
    stu1.display();

    Student5 stu2 = new Student5("uri");
    stu2.setScore(-90);
    // stu2.score = -90;
    stu2.display();
  }
}

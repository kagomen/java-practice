package oop;

public class StudentSample {
  public static void main(String[] args) {
    Student student = new Student();
    student.name = "Kagome";
    student.setScore(82, 71);
    student.display();
    System.out.println("Avg: " + student.getAvg());
  }
}

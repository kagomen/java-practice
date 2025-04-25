package oop3;

public class Student1 {
  private String name;
  private Club club;

  public Student1(String name, Club club) {
    this.name = name;
    this.club = club;
  }

  public void display() {
    System.out.println("Student name: " + name);
    club.display();
  }

  public void practice() {
    club.practice();
  }
}

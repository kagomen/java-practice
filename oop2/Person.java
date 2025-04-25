package oop2;

public class Person {
  private String name;

  public void setName(String n) {
    name = n;
  }

  public String getName() {
    return name;
  }

  public void display() {
    System.out.println("Name: " + name);
  }
}

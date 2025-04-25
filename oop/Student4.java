package oop;

public class Student4 {
  String name;
  static int num;

  Student4(String n) {
    num++;
    name = n;
    System.out.println("Generate Instance: " + name);
  }

  static void display() {
    System.out.println("Instance counts: " + num);
  }
}

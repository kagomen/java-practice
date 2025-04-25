package oop3;

public class StuSample1 {
  public static void main(String[] args) {
    Football fb = new Football();
    Student1 kagome = new Student1("Kagome", fb);
    kagome.display();
    kagome.practice();

    TandF tf = new TandF();
    Student1 uri = new Student1("Uri", tf);
    uri.display();
    uri.practice();
  }
}

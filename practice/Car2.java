public class Car2 {
  private int no;
  private int speed;
  private static int count = 0;

  public Car2() {
    no = 0;
    count++;
    System.out.println("Car count: " + count);
  }

  public Car2(int n) {
    no = n;
    count++;
    System.out.println("Car count: " + count);
  }

  public void run(int s) {
    speed = s;
  }

  public void brake() {
    speed = 0;
  }

  public void brake(int s) {
    speed -= s;
  }

  public void display() {
    System.out.println("Car Info");
    System.out.println("Number: " + no);
    System.out.println("Speed: " + speed);
  }
}
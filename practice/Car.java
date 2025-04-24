public class Car {
  int no;
  int speed;

  void setNo(int n) {
    no = n;
  }

  void run(int s) {
    speed = s;
  }

  void stop() {
    speed = 0;
  }

  void display() {

    System.out.println("Car Info");
    System.out.println("Number: " + no);
    System.out.println("Speed: " + speed);
  }
}

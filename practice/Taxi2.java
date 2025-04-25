public class Taxi2 extends Car4 {
  Taxi2() {
    this(9999);
    System.out.println("Taxi2()");
  }

  Taxi2(int no) {
    super(9999);
    System.out.println("Taxi2(int no)");
  }

  Taxi2(String no) {
    System.out.println("Taxi2(String no)");
  }
}

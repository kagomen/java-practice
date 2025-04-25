public class Taxi1 extends Car3 {
  private int price;

  Taxi1(int no) {
    this(no, 0);
  }

  Taxi1(int no, int price) {
    super(no);
    this.price = price;
  }

  public void start() {
    this.price = 420;
  }

  public void run() {
    this.price += 80;
  }

  public void display() {
    super.display();
    System.out.println("Price: " + this.price);
  }
}

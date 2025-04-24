package basic;

public class Branch1 {
  public static void main(String[] args) {
    int price = Integer.parseInt(args[0]);
    double rate = 0.10;
    int discount;

    if (price >= 5000) {
      discount = 500;
    } else if (price >= 3000) {
      discount = 300;
    } else {
      discount = 0;
    }

    int amount = (int) (price * (1 + rate) - discount);
    System.out.println("値引金額: " + discount);
    System.out.println("税込金額: " + amount);
  }
}

package basic;

public class Cast {
  public static void main(String[] args) {
    int price = Integer.parseInt(args[0]);
    double rate = 0.08;
    int amount = (int) (price * (1 + rate));
    int amount2 = (int) 987.46;

    System.out.println("税込" + amount + "円");
    System.out.println("税込" + amount2 + "円");
  }
}

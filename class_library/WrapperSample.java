package class_library;

public class WrapperSample {
  public static void main(String[] args) {
    Integer i = 10;
    Integer j = new Integer(10);
    Integer k = 10;

    System.out.println(i == j);
    System.out.println(i == k);

    System.out.println(i.MIN_VALUE);
    System.out.println(i.MAX_VALUE);

    int l = Integer.parseInt("10");

    String m1 = Integer.toString(10);
    String m2 = i.toString();
    String m3 = "" + 10;

    try {
      int n = Integer.parseInt(args[0]);
      String s = Integer.toBinaryString(n);
      System.out.println("二進数: " + s);
    } catch (NumberFormatException e) {
      System.out.println(Integer.MIN_VALUE + "から" + Integer.MAX_VALUE + "までの数値を入力してください");
    }
  }
}

package basic;

public class Operator {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]); // 文字列 -> int
    int b = Integer.parseInt(args[1]);

    System.out.println(a + b);
  }
}

// java -cp bin basic.Operator 1 2
// -> 3

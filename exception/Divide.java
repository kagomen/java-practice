package exception;

public class Divide {
  public static void main(String[] args) {
    try {
      int a = Integer.parseInt(args[0]);
      int b = Integer.parseInt(args[1]);

      System.out.println("計算開始");
      System.out.println("a / b = " + (a / b) + " … " + (a % b));
      System.out.println("計算終了");

    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("2つの数値を入力してください");
      System.out.println("エラーメッセージ: " + e.getMessage());
      e.printStackTrace();

    } catch (NumberFormatException e) {
      System.out.println("数値を入力してください");

    } catch (ArithmeticException e) {
      System.out.println("割る数は0以外を入力してください");

    } catch (Exception e) {
      System.out.println("予期せぬエラーが発生しました");

    } finally {
      System.out.println("プログラム終了");
    }
  }
}

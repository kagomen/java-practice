public class Array {
  public static void main(String[] args) {
    int[] score = new int[3];
    score[0] = 80;
    score[1] = 100;
    score[2] = 75;

    // 変数宣言と同時に初期化する場合は、newを使わない糖衣構文を使用できる
    int[] score2 = {99, 45, 37};

    System.out.println(score2[2]); // 37
    System.out.println(score2.length); // 3
  }
}

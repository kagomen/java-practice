public class MultiArray {
  public static void main(String[] args) {
    int[][] allScore = new int[2][3];
    allScore[0][0] = 80;
    allScore[0][1] = 90;
    allScore[0][2] = 100;
    allScore[1][0] = 40;
    allScore[1][1] = 50;
    allScore[1][2] = 60;

    int[][] allScore2 = {{80, 90, 100}, {40, 50, 60}};

    System.out.println(allScore2.length); // 2
    System.out.println(allScore2[0].length); // 3
  }
}

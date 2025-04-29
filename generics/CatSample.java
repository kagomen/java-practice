package generics;

public class CatSample {
  public static void main(String[] args) {
    Cat<String> cat = new Cat<>(); // ダイヤモンド演算子<>によるジェネリクス型推論

    cat.setData("Tama");
    System.out.println(cat.getData());

    Cat<Integer> cat2 = new Cat<>();
    cat2.setData(123);
    System.out.println(cat2.getData());
  }
}

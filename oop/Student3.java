package oop;

public class Student3 {
  String name;
  int englishScore;
  int mathScore;

  // 引数なしのコンストラクタを定義しておいた方がよい
  // 理由：コンストラクタを引数なしで呼び出した時、エラーになる
  Student3() {}

  // コンストラクタ
  Student3(String n) {
    name = n;
  }

  // コンストラクタをオーバーロード
  Student3(String n, int e, int m) {
    name = n;
    englishScore = e;
    mathScore = m;
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("English Score: " + englishScore);
    System.out.println("Math Score: " + mathScore);
  }
}
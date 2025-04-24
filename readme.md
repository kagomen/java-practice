```bash
# 出力先ディレクトリを指定してコンパイル
javac -d bin basic/Hello.java

# ワイルドカードで複数ファイルをコンパイル
javac -d bin basic/**/*.java

# クラスパスを指定して実行
java -cp bin Hello
```

package を使用する場合

```bash
#basic/Hello.java
package basic;

package basic;

class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World!");
  }
}
```

```bash
javac -d bin basic/Hello.java
java -cp bin basic.Hello
```

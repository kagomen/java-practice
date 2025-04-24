```bash
# 出力先ディレクトリを指定してコンパイル
javac -d bin basic/Hello.java

# ワイルドカードで複数ファイルをコンパイル
javac -d bin basic/**/*.java

# クラスパスを指定して実行
java -cp bin Hello
```

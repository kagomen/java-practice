package generics;

public class Cat<T> {
  private T data;

  public void setData(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }
}

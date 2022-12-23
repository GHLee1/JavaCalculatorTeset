package day8;

public class MethodTest {
  public static void main(String[] args) {

    int sum = 0;

    sum = add(1, 3);

    System.out.println(sum);
    System.out.println(sub(20, 10));
  }

  public static int add(int a, int b) {
    return a + b;
  }

  public static int sub(int a, int b) {
    return a - b;
  }

  public static int devide(int a, int b) {
    return a / b;
  }

  public static int multi(int a, int b) {
    return a * b;
  }
}

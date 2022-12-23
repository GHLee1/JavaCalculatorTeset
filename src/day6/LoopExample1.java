package day6;

public class LoopExample1 {
  public static void main(String[] args) {
    // 1~100사이의 짝수의 합
    int n = 0;
    int sum = 0;
    // while (n <= 100) {
    // sum += n;
    // n += 2;
    // }
    // do {
    // sum += n;
    // n++;
    // } while (n <= 100);

    // for (int i = 0; i <= 100; i += 2) {
    // sum += i;
    // System.out.println(sum);
    // }

    for (int i = 0; i <= 10; i++) {
      sum = sum + i;
    }
    System.out.println(sum);
  }
}

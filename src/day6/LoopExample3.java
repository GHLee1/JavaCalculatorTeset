package day6;

public class LoopExample3 {
  public static void main(String[] args) {
    // continue를 만나면 반복문의 처음으로 돌아감

    int sum = 0;
    for (int i = 1; i < 10; i++) {
      if (i % 2 == 0) {
        continue;
      }
      sum = sum + i;
      System.out.println(sum);
    }
  }
}

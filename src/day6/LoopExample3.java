package day6;

public class LoopExample3 {
  public static void main(String[] args) {
    // continue�� ������ �ݺ����� ó������ ���ư�

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

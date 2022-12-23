package day6;

import java.util.Scanner;

public class LoopPractice2 {
  public static void main(String[] args) {
    // 정수 5개를 입력받아 합계를 구하시오.
    Scanner sc = new Scanner(System.in);
    System.out.println("정수5개를 입력해주세요.");
    int num = 0;
    int sum = 0;

    for (int i = 1; i <= 5; i++) {
      System.out.println(i + "번째 정수 입력: ");
      num = sc.nextInt();
      sum += num;
    }
    System.out.println(sum);
  }
}

package day6;

import java.util.Scanner;

public class LoopPractice3 {
  public static void main(String[] args) {
    // 정수 2개를 입력받아 그사이의 모든 정수의 합계를 구하시오
    // 입력받은 2개의 정수도 합계에 포합한다. 더 큰 수가 먼저 입력되어도 같은 계산결과가 나오도록 한다.

    Scanner sc = new Scanner(System.in);
    System.out.println("첫번째 정수를 입력하세요");
    int num1 = sc.nextInt();
    System.out.println("두번째 정수를 입력하세요");
    int num2 = sc.nextInt();
    int sum = 0;

    if (num1 < num2) {
      for (int i = num1; i <= num2; i++) {
        sum += i;
      }
    } else {
      for (int i = num2; i <= num1; i++) {
        sum += i;
      }
    }

    System.out.println(sum);
  }
}

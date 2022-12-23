package day4;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("정수를 입력하세요");
    int num1 = sc.nextInt();
    if (num1 % 2 == 0) {
      System.out.printf("%d : 짝수입니다.", num1);
    } else {
      System.out.printf("%d : 홀수입니다.", num1);
    }
    sc.close();

  }
}

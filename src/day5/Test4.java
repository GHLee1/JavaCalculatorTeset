package day5;

import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    // 2개의 정수로 사칙 연산하기n
    Scanner sc = new Scanner(System.in);
    System.out.println("연산자를 입력하세요");
    String x = sc.next();

    System.out.println("첫번째 숫자를 입력하세요");
    int n1 = sc.nextInt();

    System.out.println("두번째 숫자를 입력하세요");
    int n2 = sc.nextInt();
    switch (x) {
      case "/":
        if (n2 == 0) {
          System.out.println("0으로 나눌 수 없습니다.");
          break;
        }
        System.out.println("첫번째 정수 :" + n1);
        System.out.println("두번째 정수 :" + n2);
        System.out.println(n1 + " / " + n2 + " = " + n1 / n2);
        break;

      case "+":
        System.out.println("첫번째 정수 :" + n1);
        System.out.println("두번째 정수 :" + n2);
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        break;

      case "-":
        System.out.println("첫번째 정수 :" + n1);
        System.out.println("두번째 정수 :" + n2);
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        break;
      case "*":
        System.out.println("첫번째 정수 :" + n1);
        System.out.println("두번째 정수 :" + n2);
        System.out.println(n1 + " * " + n2 + " = " + n1 * n2);
        break;

      default:
        System.out.println("오류입니다.");
        break;
    }



  }
}

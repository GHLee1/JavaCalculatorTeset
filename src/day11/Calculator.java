package day11;

import java.util.Scanner;

public class Calculator {

  // 멤버 변수

  int num1;
  int num2;
  String op;
  private double result;

  public Calculator() {}

  // 정보 결과 출력
  public void printInfo() {
    System.out.println(num1 + " " + op + " " + num2 + " = " + result);
  }

  // method----
  // method menu(static)
  public static void menu() {
    System.out.println("1.입력   2.출력  0.종료");
  }

  // errPrint(static)
  public static void errPrint(int num) {
    switch (num) {
      case 1:
        System.out.println("잘못 입력했습니다.");
        break;
      case 2:
        System.out.println("분모가 0이 될 수가 없습니다.");
        break;
      case 3:
        System.out.println("에러가 발생했습니다.");
        break;
    }

  }

  // input 입력값을 저장(동적할당?)
  public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("연산자를 입력하세요 (+,-,*,/) ");
    String op = sc.next();
    System.out.println("첫번째  숫자를 입력하세요");
    int fNum = sc.nextInt();
    System.out.println("두번째  숫자를 입력하세요");
    int tNum = sc.nextInt();

    this.num1 = fNum;
    this.num2 = tNum;
    this.op = op;

  }
  // operation 연산처리

  public void Operation(int num1, String op, int num2) {
    // result에 값넣기
    switch (op) {
      case "+":
        this.result = (num1 + num2);
        break;
      case "-":
        this.result = (num1 - num2);
        break;
      case "*":
        this.result = (num1 * num2);
        break;
      case "/":
        if (num2 != 0) {
          this.result = num1 / num2;
          break;
        }
        break;
    }
  }

}

package day11;

import java.util.Scanner;

public class CalProgram {

  public static void main(String[] args) {
    Calculator cc = new Calculator();

    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("=============");
      System.out.println("계산기 프로그램을 시작합니다.");
      // 메뉴메소드
      Calculator.menu();

      int input = sc.nextInt();
      if (input == 0) {
        Calculator.errPrint(3);
        break;
      } else if (input == 1) {
        // 두 정수와 연산자를 입력받는다.
        cc.input();
      } else if (input == 2) {
        // 출력
        cc.Operation(cc.num1, cc.op, cc.num2); // 연산처리 메서드
        if (cc.num2 != 0) {
          cc.printInfo();
        } else if (cc.num2 == 0) {
          Calculator.errPrint(2);
        } else {
          Calculator.errPrint(3);
        }

      } else {
        Calculator.errPrint(1);
      }



    }



  }

}

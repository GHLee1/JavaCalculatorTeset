package day11;

import java.util.Scanner;

public class CalProgram {

  public static void main(String[] args) {
    Calculator cc = new Calculator();

    Scanner sc = new Scanner(System.in);
    while (true) {
      System.out.println("=============");
      System.out.println("���� ���α׷��� �����մϴ�.");
      // �޴��޼ҵ�
      Calculator.menu();

      int input = sc.nextInt();
      if (input == 0) {
        Calculator.errPrint(3);
        break;
      } else if (input == 1) {
        // �� ������ �����ڸ� �Է¹޴´�.
        cc.input();
      } else if (input == 2) {
        // ���
        cc.Operation(cc.num1, cc.op, cc.num2); // ����ó�� �޼���
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

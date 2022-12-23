package day11;

import java.util.Scanner;

public class Calculator {

  // ��� ����

  int num1;
  int num2;
  String op;
  private double result;

  public Calculator() {}

  // ���� ��� ���
  public void printInfo() {
    System.out.println(num1 + " " + op + " " + num2 + " = " + result);
  }

  // method----
  // method menu(static)
  public static void menu() {
    System.out.println("1.�Է�   2.���  0.����");
  }

  // errPrint(static)
  public static void errPrint(int num) {
    switch (num) {
      case 1:
        System.out.println("�߸� �Է��߽��ϴ�.");
        break;
      case 2:
        System.out.println("�и� 0�� �� ���� �����ϴ�.");
        break;
      case 3:
        System.out.println("������ �߻��߽��ϴ�.");
        break;
    }

  }

  // input �Է°��� ����(�����Ҵ�?)
  public void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("�����ڸ� �Է��ϼ��� (+,-,*,/) ");
    String op = sc.next();
    System.out.println("ù��°  ���ڸ� �Է��ϼ���");
    int fNum = sc.nextInt();
    System.out.println("�ι�°  ���ڸ� �Է��ϼ���");
    int tNum = sc.nextInt();

    this.num1 = fNum;
    this.num2 = tNum;
    this.op = op;

  }
  // operation ����ó��

  public void Operation(int num1, String op, int num2) {
    // result�� ���ֱ�
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

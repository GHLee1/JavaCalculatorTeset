package day5;

import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    // 2���� ������ ��Ģ �����ϱ�n
    Scanner sc = new Scanner(System.in);
    System.out.println("�����ڸ� �Է��ϼ���");
    String x = sc.next();

    System.out.println("ù��° ���ڸ� �Է��ϼ���");
    int n1 = sc.nextInt();

    System.out.println("�ι�° ���ڸ� �Է��ϼ���");
    int n2 = sc.nextInt();
    switch (x) {
      case "/":
        if (n2 == 0) {
          System.out.println("0���� ���� �� �����ϴ�.");
          break;
        }
        System.out.println("ù��° ���� :" + n1);
        System.out.println("�ι�° ���� :" + n2);
        System.out.println(n1 + " / " + n2 + " = " + n1 / n2);
        break;

      case "+":
        System.out.println("ù��° ���� :" + n1);
        System.out.println("�ι�° ���� :" + n2);
        System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
        break;

      case "-":
        System.out.println("ù��° ���� :" + n1);
        System.out.println("�ι�° ���� :" + n2);
        System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
        break;
      case "*":
        System.out.println("ù��° ���� :" + n1);
        System.out.println("�ι�° ���� :" + n2);
        System.out.println(n1 + " * " + n2 + " = " + n1 * n2);
        break;

      default:
        System.out.println("�����Դϴ�.");
        break;
    }



  }
}

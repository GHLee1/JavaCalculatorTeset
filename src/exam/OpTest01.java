package exam;

import java.util.Scanner;

public class OpTest01 {
  public static void main(String[] args) {
    // ������ Ȱ��, ���� 2���� �Է¹ް� ���� ������ ������ ��,�� ���� ���� ��ȯ ���
    Scanner sc = new Scanner(System.in);

    int num1, num2;
    System.out.println("ù ��° ������ �Է��ϼ���");
    num1 = sc.nextInt();
    System.out.println("�� ��° ������ �Է��ϼ���");
    num2 = sc.nextInt();
    int z;
    z = num1;
    num1 = num2;
    num2 = z;
    System.out.println("x =" + num1 + ",  y = " + num2);
  }
}

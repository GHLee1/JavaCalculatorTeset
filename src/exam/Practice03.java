package exam;

import java.util.Scanner;

public class Practice03 {
  /*
   * ���� 3�� �Է�, ������ ���� �հ���� �հ����� : ��� 60�� �̻��� �� �� �����̶� 40�� �̸� �� ��쿡 ����
   * 
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("������ ���� ������ ���޾� �Է��ϼ���.");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    int num3 = sc.nextInt();

    String result =
        ((num1 + num2 + num3) / 3 >= 60 && (num1 >= 40 && num2 >= 40 && num3 >= 40)) ? "�հ�" : "���հ�";
    System.out.println(result);
  }
}

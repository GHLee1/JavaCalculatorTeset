package day5;

import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    /*
     * ���ⱸ�ϱ� ������ �Է¹ް� �����ε� ������� ���θ� ��� ���� 1.������ 4�� ������ �������� �ش� ���� 2.������ 100���� ������ �������� �ʴ� �ش� ���
     * 3.������ 400���� ������ �������� �ش� ���� 4.�׿ܴ� ���
     */

    Scanner sc = new Scanner(System.in);
    System.out.println("�Է�:");
    int year = sc.nextInt();
    String result = "���";
    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      result = "����";
    }

    System.out.printf("%d���� %s�̴�.", year, result);



  }
}

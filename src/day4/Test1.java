package day4;

import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    // 2�����ڸ� �Է¹ް� , �Էµ� ���ڰ� ������ '���簢��'�� ���̸� ���, �Է��� ���ڰ� �ٸ���
    // ���簢���� ���̸� ����Ѵ� ���� �Էµ� ���� �� �ϳ��� 0�� ���ų� ���� ��� ���α׷� �����Ѵ�.
    Scanner sc = new Scanner(System.in);
    System.out.println("����1�� �Է����ּ���");
    int num1 = sc.nextInt();
    System.out.println("����2�� �Է����ּ���");
    int num2 = sc.nextInt();
    boolean condition = num1 > 0 && num2 > 0;
    if (num1 == num2 && (condition)) {
      System.out.println("���簢��" + ", ����: " + num1 * num2);
    } else if ((num1 != num2) && condition) {
      System.out.println("���簢��" + ", ����: " + num1 * num2);
    } else
      System.out.println("���α׷� ����");
  }
}

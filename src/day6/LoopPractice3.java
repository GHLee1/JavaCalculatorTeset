package day6;

import java.util.Scanner;

public class LoopPractice3 {
  public static void main(String[] args) {
    // ���� 2���� �Է¹޾� �׻����� ��� ������ �հ踦 ���Ͻÿ�
    // �Է¹��� 2���� ������ �հ迡 �����Ѵ�. �� ū ���� ���� �ԷµǾ ���� ������� �������� �Ѵ�.

    Scanner sc = new Scanner(System.in);
    System.out.println("ù��° ������ �Է��ϼ���");
    int num1 = sc.nextInt();
    System.out.println("�ι�° ������ �Է��ϼ���");
    int num2 = sc.nextInt();
    int sum = 0;

    if (num1 < num2) {
      for (int i = num1; i <= num2; i++) {
        sum += i;
      }
    } else {
      for (int i = num2; i <= num1; i++) {
        sum += i;
      }
    }

    System.out.println(sum);
  }
}

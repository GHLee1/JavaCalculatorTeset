package day5;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    // �ٹ��ð��� �Է¹޾� �޿��� ����Ͽ� ����Ѵ�.
    // ���� 50�ð������� �޿��� 10000���̴�. 50�ð��� �ʰ��� �ݾ׿� ���ؼ��� 10%�� �� �����Ѵ�.
    // �ٹ��ð� 65 �� 665000 10%�� �� ���� 650000 15000�� ���� �ʰ��� �ð��� 10%
    Scanner sc = new Scanner(System.in);
    int hourPay = 10000;
    int pay = 0;
    System.out.println("�ٹ��ð� :");
    int workTime = sc.nextInt();
    if (workTime <= 50) {
      System.out.println("�޿���" + workTime * 10000);
    } else {
      System.out.println("�޿���" + ((workTime - 50) * 1000 + workTime * 10000));
    }

    // if (workTime <= 50) {
    // pay = workTime * hourPay;
    // } else {
    // pay = (int) ((50 * hourPay) + ((workTime - 50) * hourPay * 1.1));
    //
    // }
    System.out.println("�޿� :" + pay);



  }
}

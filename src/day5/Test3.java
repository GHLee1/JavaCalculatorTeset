package day5;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    // �¾ �ظ� ���������� �޾� �ش� �⵵�� �츦 ���switch
    Scanner sc = new Scanner(System.in);

    System.out.println("�¾ �⵵�� �Է��Ͻÿ�");
    int year = sc.nextInt();
    // System.out.println(2001 % 12);

    int �� = year % 12;
    String result = "����";
    switch (��) {
      case 4:
        result = "��";
        break;
      case 5:
        result = "��";
        break;
      case 6:
        result = "ȣ����";
        break;
      case 7:
        result = "�䳢";
        break;
      case 8:
        result = "��";
        break;
      case 9:
        result = "��";
        break;
      case 10:
        result = "��";
        break;
      case 11:
        result = "��";
        break;
      case 0:
        result = "������";
        break;
      case 1:
        result = "��";
        break;
      case 2:
        result = "��";
        break;
      case 3:
        result = "����";
        break;
      default:
        System.out.println("�⵵�� ��Ȯ�� �Է����ּ���.");

    }
    System.out.println(year + "�����" + result + "���Դϴ�");


  }
}

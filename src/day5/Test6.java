package day5;

import java.util.Scanner;

public class Test6 {
  public static void main(String[] args) {
    /*
     * BMI ����ϱ� BMI(ü��������)�� �����Ը� Ű(���ʹ���)�� �������� ����� ��� �̰�� ����� ���� ������ ���� �Ǵܵȴ�. ��ü�� : 18.5�̸�
     * ����:18.5�̻�, 23�̸� ��ü��: 23�̻� , 25�̸� �� : 25�̻� ��°�� BMI����: 18.0(��ü��)
     */
    Scanner sc = new Scanner(System.in);

    System.out.println("�����Ը� �Է��ϼ���.");
    double kg = sc.nextDouble();

    System.out.println("���ʹ����� Ű�� �Է��ϼ���");
    double height = sc.nextDouble();

    double bmi = kg / (height * height);
    String result = "";

    if (bmi < 18.5 && height < 2) {
      result = "��ü��";
    } else if (bmi >= 18.5 && bmi < 23)
      result = "����";
    else if (bmi >= 23 && bmi < 25)
      result = "��ü��";
    else if (bmi >= 25)
      result = "��";
    else
      System.out.println("�����Կ� Ű�� ����� Ȯ�����ּ���");

    System.out.printf("BMI����: %.2f(%s)", bmi, result);
  }
}

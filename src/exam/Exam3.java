package exam;

import java.util.Scanner;

public class Exam3 {
	/*
	 * ����3 ���� ���ϱ�(���׿����� ���)
	 * ����1 4�γ����� �������� 100���� ������ �������� ������ �����̴�.
	 * ����2 400���� ������ �������� �����̴�.
	 * ���� 1 or ���� �����ϸ� �����̴�
	 * ������
	 * �⵵�� �Է��ϼ��� :2000
	 * 2000���� �����Դϴ�.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵�� �Է��ϼ��� : ");
		int year = sc.nextInt();
		String result = ((year % 4<1 && (year%100>0)) || year % 400 < 1 ? "�����̴�" :"������ �ƴϴ�.");
		System.out.println(year+"����"+" "+result);
		
	}

}









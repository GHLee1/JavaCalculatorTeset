package exam;
import java.util.*;
public class Exam1 {
	/*
	 *  ����1 : �̸�,����,Ű �Է�SCanner ���
	 *  ������
	 *  �̸�: ȫ�浿
	 *  ���� :20
	 *  Ű:172.3
	 *  �̸��� ȫ�浿�̰� ���̴� 20��,Ű�� 172.3cm�Դϴ�.
	 */
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("�̸� : ");
			String name = sc.next();
			
			System.out.print("���� : ");
			int age = sc.nextInt();
			
			System.out.print("Ű : ");
			double height  = sc.nextDouble();
			
			System.out.println("�̸��� "+name +" "+ "���̴� " +age+" "+"Ű�� "+height);
			
	}

}

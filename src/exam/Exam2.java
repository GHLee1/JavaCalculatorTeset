package exam;
import java.util.*;
public class Exam2 {
	/*
	 * ���� 2 ���� ������ ������ �Է¹޾�
	 * �׸��� �� ���� 0���� ū �� ���ϰ� �װ���� �ٸ������� �����Ѵ�.
	 * ������
	 * ������ �Է��ϼ��� : -1
	 * num�� ��:-1
	 * result�� �� :false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���:");
		int num = sc.nextInt();
		
		String result = (num>0? "true":"false"); 
		System.out.println("result�� �� : " +result);
	}

}
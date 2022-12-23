package exam;

import java.util.Scanner;

public class Exam3 {
	/*
	 * 문제3 윤년 구하기(삼항연산자 사용)
	 * 조건1 4로나누어 떨어지고 100으로 나누어 떨어지지 않으면 윤년이다.
	 * 조건2 400으로 나누어 떨어지면 윤년이다.
	 * 조건 1 or 조건 만족하면 윤년이다
	 * 실행결과
	 * 년도를 입력하세요 :2000
	 * 2000년은 윤년입니다.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("년도를 입력하세요 : ");
		int year = sc.nextInt();
		String result = ((year % 4<1 && (year%100>0)) || year % 400 < 1 ? "윤년이다" :"윤년이 아니다.");
		System.out.println(year+"년은"+" "+result);
		
	}

}









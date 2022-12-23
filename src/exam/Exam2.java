package exam;
import java.util.*;
public class Exam2 {
	/*
	 * 문제 2 변수 선언후 정수를 입력받아
	 * 그리고 그 수가 0보다 큰 지 비교하고 그결과를 다른변수에 저장한다.
	 * 실행결과
	 * 정수를 입력하세요 : -1
	 * num의 값:-1
	 * result의 값 :false
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요:");
		int num = sc.nextInt();
		
		String result = (num>0? "true":"false"); 
		System.out.println("result의 값 : " +result);
	}

}
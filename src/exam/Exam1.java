package exam;
import java.util.*;
public class Exam1 {
	/*
	 *  문제1 : 이름,나이,키 입력SCanner 출력
	 *  실행결과
	 *  이름: 홍길동
	 *  나이 :20
	 *  키:172.3
	 *  이름은 홍길동이고 나이는 20세,키는 172.3cm입니다.
	 */
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("키 : ");
			double height  = sc.nextDouble();
			
			System.out.println("이름은 "+name +" "+ "나이는 " +age+" "+"키는 "+height);
			
	}

}

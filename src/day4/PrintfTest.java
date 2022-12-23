package day4;

public class PrintfTest {
  public static void main(String[] args) {
    /*
     * Printf사용 특정한 format을 지정해서 출력 %d 정수, %s 문자열 , %f 실수형 , %c 문자형 , %n 줄바꿈, %b boolean형 , %t date,
     * time형, %o 8진수를 정수형 , %x 16진수를 정수형 출력
     */
    System.out.printf("정수출력 %d%n", 15);
    // %d 안으로 정수가 들어감
    System.out.printf("문자출력 %s", "문자출력");

    // -정수표현
    // %정수d 정수는 자릿수
    // 괄호는 없어도 됨.
    System.out.printf("[%10d]%n", 10);
    System.out.printf("[%-10d]%n", 10);
    System.out.printf("[%010d]%n", 10);

    // 실수표현
    // %전체자릿수.소수점아랫자리f
    System.out.printf("[%10.2f]%n", 3.141516);
    System.out.printf("[%-10.2f]%n", 3.141516);
    System.out.printf("[%010f]%n", 3.141516);

    // 문자
    System.out.printf("%s%n", "coding");
    System.out.printf("%S%n", "coding");


  }
}

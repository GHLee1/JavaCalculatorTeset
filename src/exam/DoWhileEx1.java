package exam;

public class DoWhileEx1 {

  public static void main(String[] args) {
    // 연습문제 1. do while문 1~50 정수중 4의 배수가 아니면서 5의 배수인 숫자출력
    // do{실행할 문장} while(조건) ;
    int num = 1;
    do {
      if (!(num % 4 == 0) && num % 5 == 0) {
        System.out.println(num);
      }
      num += 1;
    } while (num <= 50);
    // 구구단 만들기
    System.out.println("구구단 만들기");
    int dan = 3;
    int j = 1;
    do {
      System.out.println(dan + " * " + j + " = " + dan * j);
      j++;
    } while (j <= 9);
  }
}

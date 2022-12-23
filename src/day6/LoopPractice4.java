package day6;

public class LoopPractice4 {
  public static void main(String[] args) {
    // 주사위 합이 6인 모든 경우의 수를 출력하시오
    // 주사위는 1~6까지의 수르르 가짐
    // 출력결과
    // (1,5) , (2,4) (3,3) (4,2) (5,1)

    for (int i = 1; i <= 5; i++) {

      for (int j = 1; j <= 5; j++) {
        if (i + j == 6) {
          System.out.println("(" + i + "," + j + ")");
        }

      }
    }

  }
}

package exam;

public class ForEx2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    // 별 다이아몬드
    // 상단
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= 5 - i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.println();

    }
    // 하단
    for (int i = 4; i > 0; i--) {
      for (int j = 4; j >= i; j--) {
        System.out.print("  ");
      }
      for (int j = 1; j <= i * 2 - 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

  }
}

package day6;

public class LoopExample2 {
  public static void main(String[] args) {
    // ��ø�� �ݺ���
    int dan;
    int times;
    for (dan = 1; dan <= 9; dan++) {
      for (times = 2; times <= 9; times++) {
        System.out.print(times + " x " + dan + " = " + dan * times + "\t");
      }
      System.out.println();
    }
  }
}

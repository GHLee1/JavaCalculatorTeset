package day7;

public class DiaPractice {
  /*
   * ���̾Ƹ�� �����
       *
      ***
     *****
      ***
       *
   */
  public static void main(String[] args) {
    // ��� 3��
    for (int i = 1; i <= 3; i++) {
      // ����
      for (int j = 0; j <= 2 - i; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j <= 2 * i - 2; j++) {
        System.out.print("*");
      }

      System.out.println();
    }


    // �ϴ� 2��
    for (int i = 1; i <= 2; i++) {
      // ����
      for (int j = 1; j <= i; j++) {
        System.out.print(" ");
      }
      for (int j = 1; j <= 5 - 2 * i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }



  }

}

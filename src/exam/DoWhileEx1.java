package exam;

public class DoWhileEx1 {

  public static void main(String[] args) {
    // �������� 1. do while�� 1~50 ������ 4�� ����� �ƴϸ鼭 5�� ����� �������
    // do{������ ����} while(����) ;
    int num = 1;
    do {
      if (!(num % 4 == 0) && num % 5 == 0) {
        System.out.println(num);
      }
      num += 1;
    } while (num <= 50);
    // ������ �����
    System.out.println("������ �����");
    int dan = 3;
    int j = 1;
    do {
      System.out.println(dan + " * " + j + " = " + dan * j);
      j++;
    } while (j <= 9);
  }
}

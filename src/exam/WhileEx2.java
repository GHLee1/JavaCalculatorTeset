package exam;

public class WhileEx2 {

  public static void main(String[] args) {
    System.out.println("������");
    int num1 = 1, num2 = 1;
    while (num1 <= 9) {
      if (!(num1 == 10)) {
        System.out.println("-------------" + num1 + "��" + "-----------------");
      }
      while (num2 <= 9) {
        System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
        num2 += 1;
      }
      num1 += 1;
      num2 = 1; // num2�� �ʱ�ȭ ���Ѿ� ����while�� �ٽ� �ݺ���

    }
  }

}

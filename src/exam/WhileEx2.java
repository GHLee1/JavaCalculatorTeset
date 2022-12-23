package exam;

public class WhileEx2 {

  public static void main(String[] args) {
    System.out.println("구구단");
    int num1 = 1, num2 = 1;
    while (num1 <= 9) {
      if (!(num1 == 10)) {
        System.out.println("-------------" + num1 + "단" + "-----------------");
      }
      while (num2 <= 9) {
        System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
        num2 += 1;
      }
      num1 += 1;
      num2 = 1; // num2를 초기화 시켜야 안쪽while이 다시 반복함

    }
  }

}

package exam;

public class ForEx1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    for (int i = 2; i < 10; i++) {
      if (!(i == 10)) {
        System.out.println("============" + i + "??===============");
      }
      for (int j = 1; j < 10; j++) {
        System.out.println(i + " * " + j + " = " + i * j);
      }
    }
  }
}

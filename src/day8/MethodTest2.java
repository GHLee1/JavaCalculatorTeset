package day8;

public class MethodTest2 {

  public static void main(String[] args) {
    MethodTest2 ts = new MethodTest2();
    ts.hello();
    System.out.println(ts.hello("파라미터 o,리턴값o"));
    printMethod("파라미터o,리턴값x");
    System.out.println("파라미터x,리턴값o \t" + printTest());

  }

  // 파라미터x 결과값x
  public void hello() {
    System.out.println("파라미터x 결과값x");
  }

  // 파라미터o 결과값 o
  public String hello(String a) {
    String hello = a;
    return hello;
  }

  // 파라미터o 결과값x
  public static void printMethod(String hello) {
    System.out.println(hello);
  }

  // 파라미터x 결과값o
  public static int printTest() {
    int result = 10;
    return result;
  }
}

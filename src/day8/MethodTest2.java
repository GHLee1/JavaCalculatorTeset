package day8;

public class MethodTest2 {

  public static void main(String[] args) {
    MethodTest2 ts = new MethodTest2();
    ts.hello();
    System.out.println(ts.hello("�Ķ���� o,���ϰ�o"));
    printMethod("�Ķ����o,���ϰ�x");
    System.out.println("�Ķ����x,���ϰ�o \t" + printTest());

  }

  // �Ķ����x �����x
  public void hello() {
    System.out.println("�Ķ����x �����x");
  }

  // �Ķ����o ����� o
  public String hello(String a) {
    String hello = a;
    return hello;
  }

  // �Ķ����o �����x
  public static void printMethod(String hello) {
    System.out.println(hello);
  }

  // �Ķ����x �����o
  public static int printTest() {
    int result = 10;
    return result;
  }
}

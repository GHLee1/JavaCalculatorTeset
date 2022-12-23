package day2;

public class Person {
  static String name = "이건희";
  int age = 26;

  public void print() {
    System.out.println(name + "의 나이는 " + age);
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println(name);
    Person p = new Person();
    // p.name = "김동진";
    p.print();
    // 클래스 메소드는 객체화해야 사용가능

    // Person p = new Person();
    // Person p2 = new Person();
    // System.out.println(p.name);
    // p2.name = "홍길동";
    // System.out.println(p.name == p2.name);
    //
    // int a = 5;
    // String result = a>0?"a가 0보다 크다":"아니다";
    // System.out.println(result);
  }

}

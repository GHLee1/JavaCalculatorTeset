package day2;

public class Person {
  static String name = "�̰���";
  int age = 26;

  public void print() {
    System.out.println(name + "�� ���̴� " + age);
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    System.out.println(name);
    Person p = new Person();
    // p.name = "�赿��";
    p.print();
    // Ŭ���� �޼ҵ�� ��üȭ�ؾ� ��밡��

    // Person p = new Person();
    // Person p2 = new Person();
    // System.out.println(p.name);
    // p2.name = "ȫ�浿";
    // System.out.println(p.name == p2.name);
    //
    // int a = 5;
    // String result = a>0?"a�� 0���� ũ��":"�ƴϴ�";
    // System.out.println(result);
  }

}

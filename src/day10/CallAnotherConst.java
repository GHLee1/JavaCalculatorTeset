package day10;

public class CallAnotherConst {
  public static void main(String[] args) {
    // �����ڿ��� �ٸ� �����ڸ� ȣ���ϴ�this
    Person noname = new Person();

    System.out.println(noname.name);
    System.out.println(noname.age);

    System.out.println("===");


    Person p = noname.returnItSelf();
    System.out.println(p);
    System.out.println(noname);
  }
}



class Person {
  String name;
  int age;


  Person() {
    this("�̸�����", 1); // �⺻ �����ɶ� �̰��� ��
  }

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person returnItSelf() {
    return this;
  }

}

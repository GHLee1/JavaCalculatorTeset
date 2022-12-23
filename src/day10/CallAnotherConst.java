package day10;

public class CallAnotherConst {
  public static void main(String[] args) {
    // 생성자에서 다른 생성자를 호출하는this
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
    this("이름없음", 1); // 기본 생성될때 이값이 들어감
  }

  Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public Person returnItSelf() {
    return this;
  }

}

package day9;

public class Person {
  String name;
  float height;
  float weight;

  // 명시적 생성자를 만들면 기본생성자를 추가 시켜줘야함.
  public Person() {

  }

  // 명시적 생성자
  public Person(String name, float height, float weight) {
    this.name = name;
    this.height = height;
    this.weight = weight;
  }
}

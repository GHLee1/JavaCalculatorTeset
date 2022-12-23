package day10;

public class Student {

  public String name;
  public int grade;
  public int money;

  public Student() {}

  public Student(String name, int money) {
    this.name = name;
    this.money = money;
  }

  public void takeBus(Bus bus) {
    bus.take(1000);
    this.money -= 1000;
  }

  public void takeSubway(Subway subway) {
    subway.take(1500);
    this.money -= 1500;

  }

  public void showInfo() {
    System.out.println(name + "���� ���� ����" + money + "�Դϴ�.");
  }



}

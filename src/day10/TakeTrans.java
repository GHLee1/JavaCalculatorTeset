package day10;

public class TakeTrans {
  public static void main(String[] args) {
    Student lee = new Student("�̰���", 100000);
    Student james = new Student("���ӽ�", 10000);

    Bus bus100 = new Bus(100);
    lee.takeBus(bus100);
    lee.showInfo();
    bus100.showinfo();

    Subway s1 = new Subway("1ȣ��");
    james.takeSubway(s1);
    james.showInfo();
    s1.showInfo();

  }
}

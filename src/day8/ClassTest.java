package day8;

public class ClassTest {

  public static void main(String[] args) {
    Student st = new Student();
    System.out.println(st.showStudentInfo("이름", "주소"));

  }
}


class Student {
  int sID;
  int grade;
  // 참조형 데이터타입(class,interface,array,enum,collection)
  String name;
  String address;

  public String showStudentInfo(String name, String address) {
    String result = name + "," + address;
    return result;
  }


}

package day8;

public class ClassTest {

  public static void main(String[] args) {
    Student st = new Student();
    System.out.println(st.showStudentInfo("�̸�", "�ּ�"));

  }
}


class Student {
  int sID;
  int grade;
  // ������ ������Ÿ��(class,interface,array,enum,collection)
  String name;
  String address;

  public String showStudentInfo(String name, String address) {
    String result = name + "," + address;
    return result;
  }


}

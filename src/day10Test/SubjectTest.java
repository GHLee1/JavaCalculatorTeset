package day10Test;

import java.util.ArrayList;
import java.util.Scanner;

class Person1 {
  // 학번,국어,수학,영어
  public int sno;
  public int kor;
  public int math;
  public int eng;

  public Person1() {}

  public Person1(int sno, int kor, int math, int eng) {
    this.sno = sno;
    this.kor = kor;
    this.math = math;
    this.eng = eng;
  }

  public int getSno() {
    return sno;
  }

  public void setSno(int sno) {
    this.sno = sno;
  }

  public int getKor() {
    return kor;
  }

  public void setKor(int kor) {
    this.kor = kor;
  }

  public int getMath() {
    return math;
  }

  public void setMath(int math) {
    this.math = math;
  }

  public int getEng() {
    return eng;
  }

  public void setEng(int eng) {
    this.eng = eng;
  }

  @Override
  public String toString() {
    return "[학생의 학번 : " + sno + ", 국어점수 :" + kor + ", 수학점수 : " + math + ", 영어점수 : " + eng + "]";
  }



}


public class SubjectTest {

  public static void main(String[] args) {
    // 입력 조회 수정 삭제
    Person1 ps = new Person1();
    Scanner sc = new Scanner(System.in);
    ArrayList<Person1> arr = new ArrayList<Person1>();
    System.out.println("학생 정보 시스템 입력");
    int index = 0;

    while (true) {
      System.out.println("0. 종료\t 1.입력\t 2.조회");
      int input = sc.nextInt();
      // 1번 입력할 때 마다 temp가 쌓여서 인덱스 갯수를 늘려준다.

      if (input == 0) {
        System.out.println("시스템을 종료합니다.");
        break;
      } else if (input == 1) {

        System.out.println("학번을 입력하세요 : ");
        int sno_id = sc.nextInt();
        System.out.println("국어점수 입력하세요 : ");
        int kor_score = sc.nextInt();
        System.out.println("수학점수 입력하세요 : ");
        int math_score = sc.nextInt();
        System.out.println("영어점수 입력하세요 : ");
        int eng_score = sc.nextInt();
        for (int i = 0; i < index + 1; i++) {
          arr.add(i, new Person1(sno_id, kor_score, math_score, eng_score));

        }
        index++;
      } else if (input == 2) {
        System.out.println("학번을 입력하세요");
        int sno_id = sc.nextInt();
        // 조회 할 사람의 학번을 입력받고 조회할 list에서 contain값이있으면 list를 tostring
        // arraylist를 향상된for로 풀고 arr.get
        // arr.get(0).getSno();


        // 조회
      }



    }


  }

}

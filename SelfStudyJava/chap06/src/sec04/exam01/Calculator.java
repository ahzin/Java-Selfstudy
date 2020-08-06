package sec04.exam01;

public class Calculator {
  //Filed
  //Constructor
  //Method

  //실행결과가 없는 메소드
  void powerOn() {  //실행결과가 없는 메소드
    System.out.println("전원을 켭니다.");
  }

  //결과값이 있는 메소드
  //외부에서 값을 받아옴
  int plus(int x, int y) {
    int result = x + y; //result 변수선언
    return result;
  }

  double divide(int x, int y) {
    double result = (double)x / (double)y; //강제 타입 변환, 하나만 바꿔도 ㅇㅋ
    return result;
  }

  void powerOff() {
    System.out.println("전원을 끕니다.");
  }
}

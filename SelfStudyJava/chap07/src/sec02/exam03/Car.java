package sec02.exam03;

public class Car {
  //필드
  Tire frontLeftTire = new Tire("앞왼쪽", 6); //최대수명 6회전
  Tire frontRightTire = new Tire("앞오른쪽", 2); //최대수명 2회전
  Tire backLeftTire = new Tire("뒤왼쪽", 3); //최대수명 3회전
  Tire backRightTire = new Tire("뒤오른쪽", 4); //최대수명 4회전

  //생성자

  //메소드
  int run() {
    System.out.println("[자동차가 달립니다.]");
    if(frontLeftTire.roll()==false) { stop(); return 1; };
    if(frontRightTire.roll()==false) { stop(); return 2; };
    if(backLeftTire.roll()==false) { stop(); return 3; };
    if(backRightTire.roll()==false) { stop(); return 4; };
    return 0; //어떤 타이어도 펑크나지 않았다.
  }

  void stop() {
    System.out.println("[자동차가 멈춥니다 .]");
  }
}


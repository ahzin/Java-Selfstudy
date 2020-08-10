package sec05.exam03;

public class Car {
  int speed; //인스턴스 필드

  void run() { //인스턴스 메소드
    System.out.println(speed + "으로 달립니다.");
  }
  /*
   * void static run()으로 할 시 run은 car객체 없이도 사용할 수 있어야하고,
   * speed에서 오류가 뜨는데, speed는 인스턴스 변수라 객체없이 사용할 수 없다.
   * 따라서, int static speed로 선언하거나,
   * println문 전에,
   *Car myCar = new Car();
   * myCar.speed = 60;을 삽입하고,
   * println문 내의 speed를 myCar.speed로 써야한다.
   */

  public static void main(String[] args) { //정적메소드
    //speed = 60; 오류! 객체가 없다.
    //run(); 오류! 객체가 없다.

    Car myCar = new Car(); //객체를 만들어서 작성한다.
    myCar.speed = 60;
    myCar.run();
  }
}


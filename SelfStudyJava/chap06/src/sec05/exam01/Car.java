package sec05.exam01;

public class Car {
  //필드
  String model;
  int speed;

  //생성자
  Car(String model) {
    this.model = model;
    //this.model(필드에 있는 model) = 매개변수의 model
  }

  //메서드
  void setSpeed(int speed) {
    this.speed = speed;
    //this.speed(필드에 있는 speed) = 매개변수의 speed

  }

  void run() {
    for(int i=10; i<=50; i+=10) {
      this.setSpeed(i); //인스턴스 메서드이기 떄문에 this를 생략해도 된다
      System.out.println(this.model + "가 달립니다: (" + this.speed + "km/h)");
    }
  }
}

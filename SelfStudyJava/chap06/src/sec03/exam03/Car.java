package sec03.exam03;

public class Car {
  //필드
  String company = "현대자동차";
  String model;
  String color;
  int maxSpeed;

  //생성자
  Car() { //기본값으로 초기화되는 클래스
  }

  Car(String model) {
    this.model = model;
  }

  Car(String model, String color) {
    this.model = model;
    this.color = color;
  }

  Car(String model, String color, int maxSpeed) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
}



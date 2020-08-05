package sec03.exam04;

public class Car {
  //필드
  String company = "현대자동차";
  String model;
  String color;
  int maxSpeed;

  //생성자
  Car() {
  }

  //중복코드를 this()로 줄이자
  Car(String model) {
    this(model, null, 0);
  }

  Car(String model, String color) {
    this(model, color, 0);
    //원래 코드
    //this.model = model;
    //this.color = color;
  }

  Car(String model, String color, int maxSpeed) {
    this.model = model;
    this.color = color;
    this.maxSpeed = maxSpeed;
  }
}


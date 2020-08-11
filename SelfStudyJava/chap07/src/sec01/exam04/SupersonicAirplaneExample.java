package sec01.exam04;

public class SupersonicAirplaneExample {
  public static void main(String[] args) {

    SupersonicAirplane sa = new SupersonicAirplane();
    sa.takeOff(); //"이륙합니다"

    sa.fly(); //supersonicAirplane의 재정의된 fly()이지만,
    //flymode를 주지 않아 부모의 fly() 리턴 "일반비행합니다."

    sa.flyMode = SupersonicAirplane.SUPERSONIC;
    sa.fly(); //"초음속비행입니다."

    sa.flyMode = SupersonicAirplane.NORMAL;
    sa.fly(); //"일반비행합니다."

    sa.land(); //"착륙합니다."

  }
}


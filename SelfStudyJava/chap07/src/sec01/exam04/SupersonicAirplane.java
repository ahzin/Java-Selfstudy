package sec01.exam04;

public class SupersonicAirplane extends Airplane {
  public static final int NORMAL = 1; //일반비행모드
  public static final int SUPERSONIC = 2; //초음속비행모드

  public int flyMode = NORMAL; //비행모드 저장, 기본값 NORMAL

  //재정의 단축키 ctrl+ space
  @Override
  public void fly() {
    //비행모드에 따라서 다르게 비행
    if(flyMode == SUPERSONIC) {
      System.out.println("초음속비행입니다.");
    }else {
      //부모의 메소드 호출
      //      public void fly() {
      //        System.out.println("일반비행합니다.");
      //      }
      super.fly(); //fly()는 재정의 했기 때문에 super.을 안하면 안됌
    }
  }
}


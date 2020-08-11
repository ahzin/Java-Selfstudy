package sec01.exam01;

public class CellPhone {
  //필드
  String model;
  String color;
  //다른패키지에 있을 경우에는 default 이므로
  //public String model;
  //public String color; 로 써야한다.

  //생성자
  public CellPhone() {
    System.out.println("CellPhone() 호출됨!");
  }

  //메소드
  void powerOn() { System.out.println("전원을 켭니다."); }
  void powerOff() { System.out.println("전원을 끕니다."); }
  void bell() { System.out.println("벨이 울립니다."); }
  void sendVoice(String message) { System.out.println("자기: " + message); }
  void receiveVoice(String message) { System.out.println("상대방: " + message); }
  void hangUp() { System.out.println("전화를 끊습니다."); }
}


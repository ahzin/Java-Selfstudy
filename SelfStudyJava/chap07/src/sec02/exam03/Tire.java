package sec02.exam03;
//타이어가 가지고있는 일반특성만 정의
public class Tire {
  //필드
  public int maxRotation;     			//최대 회전수(타이어 수명)
  public int accumulatedRotation;		//누적 회전수
  public String location;       			//타이어의 위

  //생성자
  public Tire(String location, int maxRotation) {
    this.location = location; //왼/오/앞/뒤
    this.maxRotation = maxRotation;
  }

  //메소드
  public boolean roll() { //회전 할수 있니, 없니?
    ++accumulatedRotation;
    if(accumulatedRotation<maxRotation) {
      System.out.println(location + " Tire 수명: "
          + (maxRotation-accumulatedRotation) + "회");
      return true;
    } else {
      System.out.println("*** " + location + " Tire 펑크 ***");
      return false;
    }
  }
}


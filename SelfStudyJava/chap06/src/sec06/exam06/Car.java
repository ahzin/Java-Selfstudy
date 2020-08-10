package sec06.exam06;

public class Car {
  //필드
  private int speed;
  private boolean stop;

  //생성자

  //메소드
  //Getter
  public int getSpeed() {
    return speed;
  }

  //Setter
  public void setSpeed(int speed) {
    if(speed < 0) {
      this.speed = 0;
      return;
    } else {
      this.speed = speed;
    }
  }

  public boolean isStop() { //true면 stop리턴
    return stop;
  }

  //false라 stop리턴을 안하고
  //speed의 값인 60을 리턴하고 끝

  public void setStop(boolean stop) {
    this.stop = stop;
    if(stop) {
      speed = 0;
    }

  }
}

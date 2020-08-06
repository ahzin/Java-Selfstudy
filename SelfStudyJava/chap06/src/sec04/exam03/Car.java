package sec04.exam03;

public class Car {
  //Field
  int gas;

  //Constructor

  //Method
  void setGas(int gas) {
    this.gas = gas; //int로 받은 gas를 필드로 저장
  }

  boolean isLeftGas() {
    if(gas==0) {
      System.out.println("gas가 없습니다.");
      return false;
    }
    System.out.println("gas가 있습니다.");
    return true;
  }


  void run() { //외부로부터 받는 값이 없음
    while(true) {
      if(gas > 0) {
        System.out.println("달립니다.(gas잔량:" + gas + ")");
        gas--;
      } else {
        System.out.println("멈춥니다.(gas잔량:" + gas + ")");
        return;
      }
    }
  }
}


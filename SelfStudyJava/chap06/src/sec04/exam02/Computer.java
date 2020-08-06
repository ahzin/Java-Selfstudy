package sec04.exam02;

public class Computer {
  //method
  int sum1(int[] values) { //int 배열 생성
    int sum = 0; //초기화
    for(int i=0; i<values.length; i++) { //배열안에 있는 요소의 수만큼
      sum += values[i];
    }
    return sum;
  }

  int sum2(int ... values) {
    int sum = 0;
    for(int i=0; i<values.length; i++) {
      sum += values[i];
    }
    return sum;
  }
}

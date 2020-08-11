package sec01.exam02;

public class Student extends People{
  //People이라는 생성자를 호출해야하는데 매개값이 없음
  /*
   * public student(){
   *    super();
   * }
   * 인 상황에서 people에 name과 ssn이 없는 객체(기본생성자)를 만들 수 없기 때문
   */
  public int studentNo;

  public Student(String name, String ssn, int studentNo) {
    super(name, ssn);  //이름과 주민번호를 받는다
    this.studentNo = studentNo;
  }
}


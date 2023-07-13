package sec1;

public class Shape {
    //필드 접근제한자 : public / default(생략) / private
    //public : 어떤 패키지에서 접근할 수 있음
    //default : 같은 패키지에 있는 클래스에서만 접근할 수 있음
    //private : 현재 클래스 내부에서만 접근할 수 있음.

   //멤버필드
    public String type;//접근제한자 public
    public int length;
    public double area;//면적

    //생성자
    public Shape(){} //생성자명은 클래스명과 항상 같아야한다
    public Shape(String type){
        this.type = type; // this -> 현재클래스 내부, 하얀색 type은 매개변수


        //멤버 메소드
    public double calcArea(){  //double - 반환타입 area가 double이라 double
                if(this.type.equals("square")){
                    this.area = this.length * this.length;
                }else if (this.type.equals("triangle")){
                    this.area = this.length * 10 /2;
                }else if(this.type.equals("circle")){
                    this.area = this.length * this.length * 3.14159;
                }
        }
    }

    //setmethod(저장메소드) : 각 필드에 값을 저장할 목적
    public void setType(String type){  //setter는 무조건 void
        this.type = type;
    }


    public void setLength(int length){

    }
}

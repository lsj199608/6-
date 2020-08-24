public class Car {
    String company = "현대";
    String model = "그랜져";
    String color = "검정";
    int maxSpeed = 350;
    int speed;

    Car(){}

    /*Car(String model) { //생성자. 생성자가 하나라도 있을 시 기본 생성자는 호출할 수 없다.
        // ex) Car에 Car()이 선언되지 않고 Car(String model)만 선언되었다면
        // CarExample에서 Car myCar = new Car()로 선언 불가능
        this.model = model; // this.speed는 해당 필드의 speed 이고 speed는 매개변수로 받아온 speed 이다.
        //객체가 객체 자신을 this라고 함.
    }
    Car(String model, String color){
        this.model = model; //위에서 사용된 코드)this.model = model;이 중복되어 사용됨. 이것을 this로 바꿀수 있음.
        //이에 대한 예는 아래에 제시.
        this.color = color;
    }*/
    Car(String model){
        this(model,"은색", 250);
    }
    Car(String model, String color){
        this(model,color,250);
    }
    Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    void method(){
        speed = 20;
    }
}
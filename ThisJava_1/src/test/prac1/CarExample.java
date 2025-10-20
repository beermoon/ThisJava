package test.prac1;

public class CarExample {
    public static void main(String[] args) {

        // 객체 생성
        Car myCar = new Car();

        // 필드에 값 설정
        myCar.model = "아반떼";
        myCar.color = "빨강";
        myCar.speed = 72;

        // 메서드 호출
        myCar.drive();
        myCar.stop();

        // 다른 객체 생성
        Car yourCar = new Car();
        yourCar.model = "제네시스";
        yourCar.color = "파랑";
        yourCar.speed = 33;

        yourCar.drive();

    }
}

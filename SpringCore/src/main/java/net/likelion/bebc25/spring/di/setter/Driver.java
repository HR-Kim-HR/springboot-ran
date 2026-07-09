package net.likelion.bebc25.spring.di.setter;

public class Driver {
    private Car car;

    // setter injection
    public void setCar(Car car){
        System.out.println("Setter Injection 이 호출되었습니다.");
        this.car = car;
    }

    public void driveCar(){
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}

package OCP;

public class Car extends Vehicle {
/*
Реализация принципа Open-Closed на примере потомка Car от родителя Vehicle,
позволяющий рассчитать максимальную скорость данного ТС.
 */
    //Конструктор с константой типа транспортного средства.
    public Car(int maxSpeed) {
        super(maxSpeed, "Car");
    }
    //Перераспределённый метод родительского класса, с применением расчета скорости автомобиля.
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.8;
    }
}

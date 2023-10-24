package OCP;

public class Bus extends Vehicle {
/*
Реализация принципа Open-Closed на примере потомка Bus от родителя Vehicle,
позволяющий рассчитать максимальную скорость конкретного ТС.
 */
    //Конструктор уже имеет константу с типом транспортного средства.
    public Bus(int maxSpeed) {
        super(maxSpeed, "Bus");
    }
    //Перераспределённый метод родительского класса, с применением расчета скорости.
    @Override
    public double calculateAllowedSpeed() {
        return super.getMaxSpeed() * 0.5;
    }
}

package OCP;

public class Test {
    public static void main(String[] args) {
        /*
        Функционал класса Vehicle расширили до взаимодействия с подклассами Car и Bus,
        при этом не модифицируя основной класс.
        */
        Vehicle vehicle = new Vehicle(100, "SOLID");
        System.out.println(vehicle.getType() + " " + vehicle.calculateAllowedSpeed());
        Vehicle car = new Car(200);
        System.out.println(car.getType() + " " + car.calculateAllowedSpeed());
        Vehicle bus = new Bus(100);
        System.out.println(bus.getType() + " " + bus.calculateAllowedSpeed());
    }
}

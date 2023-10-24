package DIP;

public class Test {
    public static void main(String[] args) {
        //Убеждаемся, что код работает и принцип инверсии зависимости сохраняется.
        Car car = new Car(new PetrolEngine());
        car.start();
        car = new Car(new DieselPetrol());
        car.start();
    }
}
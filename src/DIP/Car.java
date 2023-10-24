package DIP;

public class Car {
    /*
    Основной класс запуска автомобиля, независящий от типа двигателя и
    других низкоуровневых классов, согласно принципу инверсии зависимостей.
     */
    public Engine engine;
    //В конструкторе указываем переменную абстрактного класса, исключая зависимость от других подклассов
    public Car(Engine engine) {
        this.engine = engine;
    }
    public void start() {
        engine.start();
    }
}

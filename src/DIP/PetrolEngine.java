package DIP;

public class PetrolEngine implements Engine{
    /*
    Имплементируем абстрактный интерфейс, тем самым инвертируя зависимость
    основного класса от низкоуровневых.
     */
    @Override
    public void start() {
        System.out.println("Бензиновый двигатель запущен");
    }
}

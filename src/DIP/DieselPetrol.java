package DIP;

public class DieselPetrol implements Engine {
    /*
    Метод реализации запуска дизельного двигателя на основе интерфейса Engine
     */
    @Override
    public void start() {
        System.out.println("Дизельный двигатель запущен.");
    }
}

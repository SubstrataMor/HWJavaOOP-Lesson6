package OCP;

public class Vehicle {
    /*
    Родительский класс, открытый для расширений, но не допускающий модификаций.
     */
    private int maxSpeed;
    private String type;

    //Открытый метод, позволяющий расширять наш основной класс в своих подклассах.
    public double calculateAllowedSpeed() {
        return maxSpeed;
    }
    public Vehicle(int maxSpeed, String type) {
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

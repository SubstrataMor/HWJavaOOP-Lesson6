package ISP;

public class Circle implements Shape {
    /*
    Класс Circle, который считает площадь окружности, имплементирующий себе
    только один интерфейс с необходимой функцией.
     */
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    //Метод расчета площади круга, предлагаемый интерфейсом Shape
    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
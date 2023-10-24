package ISP;

public class Cube implements Shape3D, Shape {
    /*
    Класс Куб, который имплементирует себе, согласно принципу Interface Segregation,
    специализированные интерфейсы для расчета объёма и площади куба.
     */
    private int length;

    public Cube(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    //Раздельный интерфейс для расчета площади
    @Override
    public double area() {
        return this.length * this.length * 6;
    }
    //Раздельный интерфейс для расчета объёма фигуры
    @Override
    public double volume() {
        return Math.pow(length, 3);
    }
}

package LSP;

public class Square extends QuadRangle{
    /*
    В данном случае квадрат наследует все свойства класса QuadRangle,
    при этом использует свои уникальные свойства, сохраняя поведение
    родительского класса.
     */
    private int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    public int area() {
        return this.length * this.length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
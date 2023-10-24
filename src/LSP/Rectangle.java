package LSP;

public class Rectangle extends QuadRangle {
    /*
    Согласно принципу подстановки Барбары Лисков, наследуемый класс обладает
    всеми признаками родительского класса, выдающий тот же результат.
    Или (если результат отличается) относиться к тому же типу.
     */
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.height * this.width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

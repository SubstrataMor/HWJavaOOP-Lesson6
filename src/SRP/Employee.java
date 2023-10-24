package SRP;

public class Employee {
    /*
    В базовом классе расплагаются только стандартные функции и поля.
    Никакой дополнительной ответственности этот класс не берет.
     */
    private String name;
    private String dol;

    public Employee(String name, String dol) {
        this.name = name;
        this.dol = dol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDol() {
        return dol;
    }

    public void setDol(String dol) {
        this.dol = dol;
    }
}

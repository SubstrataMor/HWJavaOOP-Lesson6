package SRP;

public class EmployeeSalaryCalculate {
    /*
    Согласно принципу единственной ответственности, каждый класс должен отвечать
    только за одну операцию. В данном случае метод salaryCalculate берет на себя
    ответственность за расчет зарплаты сотрудникам.
     */

    private int baseSalary;

    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double salaryCalculate(){
        return this.baseSalary * 1.5;
    }
}

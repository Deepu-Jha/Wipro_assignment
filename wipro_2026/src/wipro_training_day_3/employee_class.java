package wipro_training_day_3;

public class employee_class {

    private double salary;

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        employee_class emp = new employee_class();
        emp.setSalary(80000);
        System.out.println(emp.getSalary());
    }
}

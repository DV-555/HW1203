package Ex_2;

public class Employee {

    String name;
    int salary;
    int workHours;

    public Employee(String name, int salary, int workHours) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
    }

    public double addSalary() {
        double sum = 0;
        if (salary < 500) {
            sum = salary + 10;
        } else {
            sum = salary;
        }
        return sum;
    }

    public double addForWork() {
        double sumForWork = 0;
        double salary2= 0;
        if (workHours > 6) {

            sumForWork= salary2+ 5;
        }
        return sumForWork;

    }

}



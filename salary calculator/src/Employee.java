public class Employee {
    String name;
    double salary;
    int workHours;
    int hereYear;

    public Employee(String name, double salary, int workHours, int hereYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hereYear = hereYear;
    }

    public double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        }
        return 0;
    }

    public double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    public double raiseSalary() {
        int year = 2023 - this.hereYear;

        if (year < 9) {
            return this.salary * 0.05;
        }
        if ((year >= 9) && (year < 19)) {
            return this.salary * 0.1;
        }
        if (year >= 19) {
            return this.salary * 0.15;
        }
        return 0;
    }

    public void printWorker() {
        System.out.println("-----------------Employee Information-----------------");
        System.out.println("Name: "+this.name);
        System.out.println("Salary: "+this.salary);
        System.out.println("Working Hours: "+this.workHours);
        System.out.println("Start year: "+this.hereYear);
        System.out.println("tax: "+this.tax());
        System.out.println("bonus: "+this.bonus());
        System.out.println("Salary increase: "+this.raiseSalary());

        double totalSalary = this.salary+this.raiseSalary();
        System.out.println("total salary: "+totalSalary);

        double totalSalaryWithoutTax = totalSalary - this.tax() + this.bonus();
        System.out.println("Salary with taxes and bonuses: "+totalSalaryWithoutTax);
    }
}

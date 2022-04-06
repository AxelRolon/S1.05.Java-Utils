package S105N1Ex5;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee implements Serializable {
    private String name;
    private double salary;
    private Date contractData;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month-1, day);
        contractData = calendar.getTime();
    }
    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Date getContractData() {
        return contractData;
    }

    public void raiseSalary(double percentage){
        double increase = salary*percentage/100;
        salary += increase;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", contractData=" + contractData +
                '}';
    }
}

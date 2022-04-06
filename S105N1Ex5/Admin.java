package S105N1Ex5;

public class Admin extends Employee {

    private double incentive;

    public Admin(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        incentive = 0;
    }

    @Override
    public double getSalary() {
        double salaryBase = super.getSalary();
        return salaryBase + incentive;

    }

    public void setIncentive(double b) {
        incentive = b;
        this.incentive = incentive;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "incentive=" + incentive +
                '}';
    }
}


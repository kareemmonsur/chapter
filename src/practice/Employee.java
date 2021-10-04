package practice;

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;
    private double yearlySalary;
    private double percentageYearlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        yearlySalary= monthlySalary * 12;
        return yearlySalary;
    }

    public double getPercentageYearlySalary(){
        double percentageYearlySalary;
        percentageYearlySalary= getYearlySalary() * 0.10;
        return percentageYearlySalary;
    }

    public double getSalaryIncrease(){
       double salaryIncrease = getYearlySalary() + getPercentageYearlySalary();
       return salaryIncrease;

    }


    }

package practice;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("John", "Doe", 500);
        Employee employee2 = new Employee("Kim", "Doe", 2000);
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + "'s" + " " + "present salary: " + employee1.getMonthlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + "'s" + " " + "present salary: " + employee2.getMonthlySalary());
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + "'s" + " " + "new salary: " + employee1.getSalaryIncrease());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + "'s" + " " + "new salary: " + employee2.getSalaryIncrease());
    }
}

package ChapterFour;
//(Salary Calculator) Develop a Java application that determines the gross pay for each of
//        three employees. The company pays straight time for the first 40 hours worked by each employee
//        and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
//        number of hours worked last week and their hourly rates. Your program should input this informa-
//        tion for each employee, then determine and display the employee’s gross pay. Use class Scanner to
//        input the data.
// employee1 gross pay= salary * hours worked, if hours % 40
// employee1 gross pay= salary * hours worked


import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = scanner.nextDouble();
        System.out.println("Enter your hours worked: ");
        double workHours = scanner.nextDouble();
        double extraTime =  workHours % 40;
        if (workHours <= 40){
            System.out.println("GrossSalary: " + (salary * workHours));
        }
        else{
         double grossSalary = (salary * 40) + (extraTime * salary/2) ;
            System.out.println("GrossSalary: "  + grossSalary);
        }






    }
}

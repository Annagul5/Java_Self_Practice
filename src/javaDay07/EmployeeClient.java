package javaDay07;

public class EmployeeClient {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name="Dash";
        employee.age=33;
        employee.salary=6.666;
        employee.gender='m';
        employee.jobTitle="Director";

        System.out.println("Name: "+employee.name);
        System.out.println("Age: "+employee.age);
        System.out.println("Gender: "+employee.gender);
        System.out.println("Job Title: "+employee.jobTitle);
        System.out.println("Salary: "+employee.salary);
        employee.work();

        System.out.println(employee);

    }


}

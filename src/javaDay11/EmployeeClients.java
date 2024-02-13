package javaDay11;

public class EmployeeClients {
    public static void main(String[] args) {
        Employee employee = new Employee("Mary",24,
                'f',"Assistant",30.000);

        System.out.println(employee);
        employee.work();
    }
}

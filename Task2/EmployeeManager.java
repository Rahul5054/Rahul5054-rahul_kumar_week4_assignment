package Task2;
import java.util.HashMap;
import java.util.Scanner;

class Employee {

    

    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EMPLOYEE NAME : " + name + ", DEPARTMENT : " + department + ", SALARY : " + salary;
    }

}

public class EmployeeManager {

    

    public static void main(String[] args) {


        HashMap<Integer, Employee> employeeMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Adding employees

        employeeMap.put(1, new Employee("Raj kumar", "Computer Science", 60000));
        employeeMap.put(2, new Employee("JAYWANT MHALA", "IT", 75000));
        employeeMap.put(3, new Employee("Harish Palaspagar", "IT", 70000));
        employeeMap.put(4, new Employee("Rahul Kumar", "IT", 70000));

        // Displaying all employees

        System.out.println("EMPLOYEE LIST :");
        for (Integer id : employeeMap.keySet()) {
            System.out.println("ID : " + id + ", " + employeeMap.get(id));
        }

        // Retrieving employee details by ID

        System.out.print("ENTER EMPLOYEE ID : ");
        int searchId = scanner.nextInt();
        Employee employee = employeeMap.get(searchId);

        // Displaying employee details if found

        if (employee != null) {
            System.out.println("EMPLOYEE WITH ID " + searchId + ": " + employee);
        } else {
            System.out.println("EMPLOYEE WITH ID " + searchId + " NOT FOUND.");
        }

        scanner.close();
    }
}

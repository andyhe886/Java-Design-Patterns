package Structural;

import Structural.Adapter.Employee;
import Structural.Adapter.EmployeeClient;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Adapter
        EmployeeClient client = new EmployeeClient();
        List<Employee> employees = client.getEmployeeList();
        System.out.println(employees);

    }
}

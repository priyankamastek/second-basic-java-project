package org.example.test.objects;

import org.example.objects.Employee;

public class TestEmployeeObjectUpdates {

    public static void main(String[] args) {

        Employee employeeJohn = new Employee(1456L, "John", "project1");
        Employee employeeJill = new Employee(7865L, "Jill", null);
        System.out.println("EmployeeJohn = " + employeeJohn);
        System.out.println("EmployeeJill = " + employeeJill);

        // display employee id and employee name in Upper Case
//        System.out.println("employee id of John = " + employeeJohn.employeeId);
//        System.out.println("employee name = " + employeeJohn.name.toUpperCase());
//
//        System.out.println("employee id of Jill = " + employeeJill.employeeId);
//        System.out.println("employee name = " + employeeJill.name.toUpperCase());

        System.out.println("employee id of John = " + employeeJohn.getEmployeeId());
        System.out.println("employee name = " + employeeJohn.getName().toUpperCase());

        System.out.println("employee id of Jill = " + employeeJill.getEmployeeId());
        System.out.println("employee name = " + employeeJill.getName().toUpperCase());

        // Update the project for  the employee Jill

        //employeeJill.employeeId = 5438L; // Error occurred
       // employeeJill.name = "Peter"
       // employeeJill.project = "Project2"; // valid
        // employeeJill.setEmployeeId(87875L);
        employeeJill.setProject("project588888888888888888888888888888888888888888888");

        System.out.println("Updated information of Jill");
        System.out.println(employeeJill); // employeeJill.toString();
        System.out.println("Project assigned to employeeJill is -  " + employeeJill.getProject());

    }
}

package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoEmp {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Hansi",1000.9, "Musik");
        Employee e2 = new Employee(2,"Susi",345.89, "Marketing");
        Employee e3 = new Employee(3, "Anton",3930.35, "Musik");

        EmployeeManager mgr = new EmployeeManager();
        mgr.addEmployee(e1);
        mgr.addEmployee(e2);
        mgr.addEmployee(e3);

        System.out.println(mgr.findByEmpNumber(3));
        System.out.println(mgr.findByDepartment("Musik"));
        System.out.println(mgr.findByMaxSalary());


        System.out.println(e1.compareDepartment(e3));
        System.out.println(e1.compareDepartment(e2));



    }
}

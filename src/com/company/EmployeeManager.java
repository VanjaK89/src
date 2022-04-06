package com.company;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
    private ArrayList<Employee> employees; // = new ArrayList<>(); <---- ili ovako ili u konstruktoru


    public EmployeeManager(){
        employees = new ArrayList<>(); //isto je kao i ovaj gore, inicijalizuje se isto
    }

   public  void addEmployee(Employee e){
        employees.add(e);
    }
    public Employee findByEmpNumber(int number){
        for (Employee empi: employees){
            if(empi.getEmpNumber() == number){
                return empi;

        }

        }return null;
    }
    public ArrayList<Employee>findByDepartment(String department){  //ako moras return arrayliste moras napraviti novu listu i sa ifom proci kroz nju
        ArrayList<Employee> erg = new ArrayList<>();
        for (Employee e: employees){
            if(e.getDepartment().equals(department)){
                erg.add(e);
            }
        }

        return erg;

    }
    public Employee findByMaxSalary(){
        Employee highestE = null;
        double highestSalary = -1; // svejedno da li nula ili -1

        for (Employee e: employees){
            if(e.getSalary() > highestSalary){
                highestSalary = e.getSalary();
                highestE = e; //aktuele employee
            }
        }
       return highestE;

    }

}

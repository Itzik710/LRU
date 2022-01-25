package com.Itzik.task2;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = new ArrayList<Employee>(employees);
    }

    public List<Employee> getEmployees() {
        return this.employees;
    }

    @Override
    public String toString() {

        String res = " Company {employees=[";
        for (Employee employee : this.employees) {
            res = res + employee.toString() + ", ";
        }

        return "]" + res + "}";
    }
}


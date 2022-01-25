package com.Itzik.task2;

public class Employee {
    private String name;
    private int id;

    public Employee(String name, int id){
        this.id = id;
        this.name = name;
    }

    public Employee(Employee employee){
        this.id = employee.id;
        this.name = employee.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return "id: " + this.id + ", " + "name: " + this.name;
    }

}

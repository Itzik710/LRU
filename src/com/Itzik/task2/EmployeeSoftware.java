package com.Itzik.task2;

public class EmployeeSoftware extends Employee {
    private boolean isTester;

    public EmployeeSoftware(String name, int id, boolean isTester){
        super(name, id);
        this.isTester = isTester;
    }

    public boolean isTester() {
        return isTester;
    }

    @Override
    public String toString(){
        return super.toString() + "isTester: " + this.isTester;
    }
}

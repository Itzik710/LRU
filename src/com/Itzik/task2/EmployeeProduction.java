package com.Itzik.task2;

public class EmployeeProduction extends Employee{
    private boolean isProduction;

    public boolean isProduction() {
        return isProduction;
    }

    public EmployeeProduction(String name, int id, boolean isProduction){
        super(name, id);
        this.isProduction = isProduction;
    }

    @Override
    public String toString(){
        return super.toString() + "isProduction: " + this.isProduction;
    }
}

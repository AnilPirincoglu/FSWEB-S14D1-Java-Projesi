package com.ap.developerCompany;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        setSalary(Salaries.MID.getSalary());
        System.out.println("Mid Developer starts to working");
    }
}

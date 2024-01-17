package com.ap.developerCompany;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        setSalary(Salaries.SENIOR.getSalary());
        System.out.println("Senior Developer starts to working");
    }
}

package com.ap.developerCompany;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        setSalary(Salaries.JUNİOR.getSalary());
        System.out.println("Junior Developer starts to working");
    }
}

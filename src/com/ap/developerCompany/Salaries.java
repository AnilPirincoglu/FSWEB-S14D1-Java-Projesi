package com.ap.developerCompany;

public enum Salaries {
    JUNİOR(40000),
    MID(60000),
    SENIOR(80000),
    HRMANAGER(90000);

    private int salary;
    Salaries(int salary){
        this.salary= salary;
    }
    public int getSalary() {
        return salary;
    }
}

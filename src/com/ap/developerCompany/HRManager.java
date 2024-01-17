package com.ap.developerCompany;

import java.util.Arrays;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDeveloper;
    private MidDeveloper[] midDeveloper;
    private SeniorDeveloper[] seniorDeveloper;

    public HRManager(int id, String name, JuniorDeveloper[] juniorDeveloper, MidDeveloper[] midDeveloper, SeniorDeveloper[] seniorDeveloper) {
        super(id, name);
        this.juniorDeveloper = juniorDeveloper;
        this.midDeveloper = midDeveloper;
        this.seniorDeveloper = seniorDeveloper;
    }

    @Override
    public void work() {
        System.out.println("HR Manager starts to working");
    }

    public void addEmployee(int index, JuniorDeveloper jD) {
        try {
            if (juniorDeveloper[index] == null)
                juniorDeveloper[index] = jD;
            else
                System.out.println("This index is not empty.");
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found:" + index);
        }
    }

    public void addEmployee(int index, MidDeveloper mD) {
        try {
            if (midDeveloper[index] == null)
                midDeveloper[index] = mD;
            else
                System.out.println("This index is not empty.");
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found:" + index);
        }
    }

    public void addEmployee(int index, SeniorDeveloper sD) {
        try {
            if (seniorDeveloper[index] == null)
                seniorDeveloper[index] = sD;
            else
                System.out.println("This index is not empty.");
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            System.out.println("Index not found:" + index);
        }
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDeveloper=" + Arrays.toString(juniorDeveloper) +
                ", midDeveloper=" + Arrays.toString(midDeveloper) +
                ", seniorDeveloper=" + Arrays.toString(seniorDeveloper) +
                '}';
    }
}

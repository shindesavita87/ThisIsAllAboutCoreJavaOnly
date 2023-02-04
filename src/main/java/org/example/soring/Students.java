package org.example.soring;

public class Students {
    private int rollNo;
    private String name;
    private int fees;
    private char division;

    public Students(int rollNo, String name, int fees, char division) {
        this.rollNo = rollNo;
        this.name = name;
        this.fees = fees;
        this.division = division;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public char getDivision() {
        return division;
    }

    public void setDivision(char division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", fees=" + fees +
                ", division=" + division +
                '}';
    }
}


package com.sikku.collection.comparable;

public class Employee implements Comparable<Employee> {
    private int eno;
    private String ename;

    public Employee(int eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    @Override
    public int compareTo(Employee e) {
        if (this.eno > e.getEno()) {
            return 1;
        } else if (this.eno < e.getEno()) {
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                '}';
    }
}

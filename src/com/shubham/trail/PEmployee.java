package com.shubham.trail;

import java.util.List;
import java.util.Objects;

public class PEmployee {
    private int id;
    private List<Employee> employee;

    public PEmployee() {
        super();
    }

    public PEmployee(int id, List<Employee> employee) {
        this.id = id;
        this.employee = employee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Employee> getEmployee() {
        return employee;
    }

    public void setEmployee(List<Employee> employee) {
        this.employee = employee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PEmployee)) return false;
        PEmployee pEmployee = (PEmployee) o;
        return id == pEmployee.id && Objects.equals(employee, pEmployee.employee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, employee);
    }
}

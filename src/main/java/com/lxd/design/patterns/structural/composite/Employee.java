package com.lxd.design.patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subItems;

    public Employee(String name, String dept, int salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.subItems = new ArrayList<Employee>();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", subItems=" + subItems +
                '}';
    }

    public void add(Employee employee) {
        subItems.add(employee);
    }

    public void remove(Employee employee) {
        subItems.remove(employee);
    }

    public List<Employee> getSubItems() {
        return subItems;
    }
}

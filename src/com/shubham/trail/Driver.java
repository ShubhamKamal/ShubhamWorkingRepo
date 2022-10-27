package com.shubham.trail;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Driver {

    public static void main(String[] args) {

        Employee e1 = new Employee("Ram1",12);
        Employee e2 = new Employee("Ram2",13);
        Employee e3 = new Employee("Ram3",14);
        Employee e4 = new Employee("Ram4",15);
        Employee e5 = new Employee("Ram5",16);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        ;
        PEmployee pEmployee = new PEmployee(100,employeeList);
        List<PEmployee> pEmployeeList = new ArrayList<>();
        pEmployeeList.add(pEmployee);


        Student s1 = new Student("Ram1",12);
        Student s2 = new Student("Ram6",17);
        Student s3 = new Student("Ram3",14);
        Student s4 = new Student("Ram7",18);
        Student s5 = new Student("Ram5",16);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        PStudent pStudent = new PStudent(100, studentList);
        List<PStudent> pStudentList = new ArrayList<>();
        pStudentList.add(pStudent);

        List<Employee> employeeList1 = new ArrayList<>();
        List<PEmployee> pEmployeeList11 = new ArrayList<>();


        pEmployeeList.stream().forEach(pEmployee1 -> {
            int employeeId = pEmployee1.getId();
            pEmployee1.getEmployee().stream().forEach(employee -> {
                String employeeName = employee.getName();
                long employeeMobile = employee.getMobile();
                pStudentList.stream().filter(pStudent1 -> pStudent1.getId() == employeeId)
                        .forEach(pStudent1 -> {
                            pStudent1.getStudent().stream().forEach(student -> {
                                if(employeeName.equals(student.getName())
                                && employeeMobile == student.getMobile()){
                                    pEmployeeList.remove(pStudent1);
                                }
                                else{

                                    PEmployee pEmployee2 = new PEmployee();
                                    Employee employee1 = new Employee();

                                    employee1.setName(student.getName());
                                    employee1.setMobile(student.getMobile());

                                    employeeList1.add(employee1);

                                    pEmployee2.setId(pStudent1.getId());
                                    pEmployee2.setEmployee(employeeList1);

                                   // pEmployeeList11.add(pEmployee2);

                                    pEmployeeList.add(pEmployee2);

                                }
                            });

                        });

            });
        });


System.out.println(pEmployeeList.size());

    }
}


package com.apartech.form;

public class Employee {
    String emp_id, emp_name, dob, hiredate, job, salary;
            
    public Employee(String emp_id, String emp_name, String dob, String hiredate, String job, String salary){
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.dob = dob;
        this.hiredate = hiredate;
        this.job = job;
        this.salary = salary;        
    }        
            
    public String getEmp_id() {
        return emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public String getDob() {
        return dob;
    }

    public String getHiredate() {
        return hiredate;
    }

    public String getJob() {
        return job;
    }

    public String getSalary() {
        return salary;
    }
}

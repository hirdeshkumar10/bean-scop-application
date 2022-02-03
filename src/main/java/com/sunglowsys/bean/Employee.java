package com.sunglowsys.bean;

public class Employee {
    private String empTd ;
    private String name ;
    private String email ;
    private String mobile ;

    public Employee(){
        System.out.println("Employee object is created:");

    }

    public Employee(String empTd, String name, String email, String mobile) {
        this.empTd = empTd;
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }

    public String getEmpTd() {
        return empTd;
    }

    public void setEmpTd(String empTd) {
        this.empTd = empTd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empTd='" + empTd + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                '}';
    }
}

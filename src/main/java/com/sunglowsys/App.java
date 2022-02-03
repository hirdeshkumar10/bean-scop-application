package com.sunglowsys;

import com.sunglowsys.bean.Address;
import com.sunglowsys.bean.Employee;
import com.sunglowsys.configuration.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        System.out.println( "Hello World!" );
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationContext.class);

        Employee employee = context.getBean(Employee.class);
        employee.setEmpTd("57654");
        employee.setName("Hirdesh Kumar");
        employee.setEmail("hk@gmail.com");
        employee.setMobile("5578597776");

        employee.getEmail();
        employee.getEmpTd();
        employee.getMobile();
        employee.getName();
        System.out.println(employee);

        System.out.println(employee.hashCode());

        Employee employee1 = context.getBean(Employee.class);
        employee.setEmpTd("57655");
        employee.setName("Gulshan Kumar");
        employee.setEmail("gk@gmail.com");
        employee.setMobile("5578597776");

        employee.getEmail();
        employee.getEmpTd();
        employee.getMobile();
        employee.getName();
        System.out.println(employee1);

        System.out.println(employee1.hashCode());

        AnnotationConfigApplicationContext context1 = new AnnotationConfigApplicationContext(Address.class);

        Address address = context1.getBean(Address.class);

        address.getAddressLine1();
        address.getAddressLine2();
        address.getCity();
        address.getState();
        address.getCountry();
        address.getZipcode();
        System.out.println(address);

        System.out.println(address.hashCode());

        Address address1 = context1.getBean(Address.class);

        address1.getAddressLine1();
        address1.getAddressLine2();
        address1.getCity();
        address1.getState();
        address1.getCountry();
        address1.getZipcode();
        System.out.println(address1);

        System.out.println(address1.hashCode());

    }


}

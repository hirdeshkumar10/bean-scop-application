package com.sunglowsys.configuration;

import com.sunglowsys.bean.Employee;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

public class ApplicationContext {

    @Bean(name = "Employee")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)

    public Employee  getEmployee(){
        return new Employee();

    }
}

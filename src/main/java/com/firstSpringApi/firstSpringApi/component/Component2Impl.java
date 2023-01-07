package com.firstSpringApi.firstSpringApi.component;

import org.springframework.stereotype.Component;

@Component
public class Component2Impl implements ComponentDependency {


    @Override
    public void saludar() {
        System.out.println("hola mundo segunda vez");
    }
}

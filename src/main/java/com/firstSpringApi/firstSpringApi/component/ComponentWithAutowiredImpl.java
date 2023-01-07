package com.firstSpringApi.firstSpringApi.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentWithAutowiredImpl implements ComponentWithAutowired {
    @Autowired
    private ComponentOperationImpl componentOperation;

    @Override
    public void printWithAutowired() {

        System.out.println("the number is " + componentOperation.sum(8, 5));
    }
}

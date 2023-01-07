package com.firstSpringApi.firstSpringApi.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class MyBeanWithDependencyImpl implements MyBeanWithDependency {
    private MyOperation myOperation;

    public MyBeanWithDependencyImpl(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 1;
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde un bean con dependencia");
    }
}

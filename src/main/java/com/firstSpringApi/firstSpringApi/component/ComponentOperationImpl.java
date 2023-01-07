package com.firstSpringApi.firstSpringApi.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentOperationImpl implements ComponentOperation{
    @Override
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }
}

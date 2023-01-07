package com.firstSpringApi.firstSpringApi.Bean;

import org.springframework.stereotype.Component;

public class MyOperationImpl implements  MyOperation {

    @Override
    public int sum(int number) {
        return number + 1;
    }
}

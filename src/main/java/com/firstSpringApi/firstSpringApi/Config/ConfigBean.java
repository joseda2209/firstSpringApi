package com.firstSpringApi.firstSpringApi.Config;

import com.firstSpringApi.firstSpringApi.Bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBean {
    @Bean
    public MyBean beanImplementation(){
        return new MyBean2Impl();
    }
    @Bean
    public MyOperation beanOperation(){
        return new MyOperationImpl();
    }

    @Bean
    public MyBeanWithDependency beanWithDependency(MyOperation myOperation){
        return new MyBeanWithDependencyImpl(myOperation);
    }
}

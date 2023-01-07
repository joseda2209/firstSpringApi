package com.firstSpringApi.firstSpringApi;

import com.firstSpringApi.firstSpringApi.Bean.MyBean;
import com.firstSpringApi.firstSpringApi.Bean.MyBeanWithDependency;
import com.firstSpringApi.firstSpringApi.component.ComponentDependency;
import com.firstSpringApi.firstSpringApi.component.ComponentWithAutowired;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringApiApplication implements CommandLineRunner {

	private ComponentDependency componentDependency;
	private MyBean myBean;
	private MyBeanWithDependency myBeanWithDependency;

	@Autowired
	private ComponentWithAutowired componentWithAutowired;

	public FirstSpringApiApplication(@Qualifier("component2Impl") ComponentDependency componentDependency, MyBean myBean, MyBeanWithDependency myBeanWithDependency) {
		this.componentDependency = componentDependency;
		this.myBean = myBean;
		this.myBeanWithDependency = myBeanWithDependency;
	}

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		componentDependency.saludar();
		myBean.print();
		myBeanWithDependency.printWithDependency();
		componentWithAutowired.printWithAutowired();
	}
}

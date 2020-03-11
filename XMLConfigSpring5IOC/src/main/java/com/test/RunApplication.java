package com.test;

import com.test.beans.User;
import com.test.business.BusinessService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunApplication {

    private static final User user = new User();

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BusinessService service = context.getBean(BusinessService.class);
        System.out.println(service.calculate(user));
        System.out.println("Execution completed..!");
    }
}

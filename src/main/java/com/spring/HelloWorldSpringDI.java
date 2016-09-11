package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by aditya on 9/10/2016.
 */
public class HelloWorldSpringDI {
    public static void main(String[] args){
        //ApplicationContext ctx = new ClassPathXmlApplicationContext
         //       ("META-INF/spring/app-context.xml");

        ApplicationContext ctx = new ClassPathXmlApplicationContext
                ("META-INF/spring/app-context.xml");
        MessageRenderer mr = ctx.getBean("renderer", MessageRenderer.class);
        mr.render();
    }
}

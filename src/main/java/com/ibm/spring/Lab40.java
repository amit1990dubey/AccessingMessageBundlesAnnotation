package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab40 {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("ibmindia.xml");
        TestBean tb =(TestBean) ctx.getBean("testBean");
        tb.showEnglish();
        tb.showHindi();
        System.out.println("Done");
    }
}

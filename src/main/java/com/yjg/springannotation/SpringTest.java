package com.yjg.springannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qin on 17-8-27.
 */
public class SpringTest {
    public static void main(String[] args) {
        System.out.println("开始启动");
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        User user=(User)ctx.getBean("aaa");
        System.out.println(user);
    }
}

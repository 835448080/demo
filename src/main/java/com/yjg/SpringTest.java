package com.yjg;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by qin on 17-8-26.
 */
public class SpringTest {
    public static void main(String[] args) {
        /*
        sping 容器启动，以构造方法中的xml配置文件为基础
        将配置好的bean 加载到spring中去
        * */
        System.out.println("Spring 容器开始启动");
        ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        System.out.println("spring 重启开始 ");
        //生成User 实例的两种方法

        User user1=new User();
        //
        User user2=(User) ctx.getBean("user");


        User user3=ctx.getBean("user",User.class);


        System.out.println("user1==user2"+(user1==user2));
        System.out.println("user1==user3"+(user1==user3));
        System.out.println("user2==user3"+(user2==user3));


        User anotherUser =new User();
        User anotherUser1=(User) ctx.getBean("anotherUser");
        User anotherUser2=ctx.getBean("anotherUser",User.class);

        System.out.println("anotherUser==anotherUser1"+(anotherUser==anotherUser1));
        System.out.println("anotherUser==anotherUser2"+(anotherUser==anotherUser2));
        System.out.println("anotherUser1==anotherUser2"+(anotherUser1==anotherUser2));
    }
}

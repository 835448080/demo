package com.yjg.springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by qin on 17-8-27.
 */
@Component(value = "aaa")
@Scope(value="prototype")
public class User {
    private String username;
//    @Autowired
    private Dream dream;
    @PostConstruct
    public void init(){
        System.out.println("bean init");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("dean destroy");
    }
    public void setDream(Dream dream){
        this.dream=dream;
    }

}

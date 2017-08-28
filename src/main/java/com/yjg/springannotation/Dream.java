package com.yjg.springannotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by qin on 17-8-27.
 */
@Component
public class Dream {
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    private String context;
    @PostConstruct
    public void init(){
        System.out.println("start daily dream");

    }

}

package org.learn.java;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassA
{

    @PostConstruct
    public void init()
    {
        System.out.println("Init method of class A get called");
    }

    @PreDestroy
    public void predestory()
    {
        System.out.println("Destory method of class A get called");
    }
    public String doSomething()
    {
        return "Hello Spring World";
    }
}

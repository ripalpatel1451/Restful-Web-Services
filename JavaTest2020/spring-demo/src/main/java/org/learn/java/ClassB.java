package org.learn.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;

//@Component
//@Service
//@Repository
//@Scope(value="prototype")
public class ClassB
{
    @Value("1010")
    private int id;

    @Inject
    private ClassA a;

    @PostConstruct
    public void init()
    {
        System.out.println("Init method of class B get called");
    }

    @PreDestroy
    public void predestory()
    {
        System.out.println("Destory method of class B get called");
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ClassA getA() {
        return a;
    }

    public void setA(ClassA a) {
        this.a = a;
    }
}

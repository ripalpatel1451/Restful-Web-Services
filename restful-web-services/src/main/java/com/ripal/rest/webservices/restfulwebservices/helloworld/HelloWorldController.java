package com.ripal.rest.webservices.restfulwebservices.helloworld;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloWorldController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world")
    public  String helloWorld(){
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world-bean")
    public  HelloWorldBean helloWorldBean(){
        return new HelloWorldBean("Hello World");
    }

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world/path-variable/{name}")
    public  HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }

    @RequestMapping(method = RequestMethod.GET,path = "/hello-world-internationalized")
    public  String helloWorldInternationalized(){
        return messageSource.getMessage("good.morning.message",null, LocaleContextHolder.getLocale());
    }
}

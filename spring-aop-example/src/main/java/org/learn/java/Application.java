package org.learn.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.learn.java.aop.StringModifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application
{
    public static void main(String[] args)
    {
        Logger logger = LoggerFactory.getLogger(Application.class);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);



        StringModifier modifier = context.getBean(StringModifier.class);
        String ourString = "There was a old man and he was just pacing around in the park";
        String modifiedString = modifier.replaceAllA(ourString);
        logger.debug("debug message from main:{}", modifiedString);

        context.close();
    }
}

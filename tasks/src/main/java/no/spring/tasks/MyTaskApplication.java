package no.spring.tasks;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User: Michael Johansen
 * Date: 01.01.14
 * Time: 15:11
 */
public class MyTaskApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyTaskConfiguration.class);
    }
}

package no.spring.aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User: Michael Johansen
 * Date: 07.01.14
 * Time: 15:42
 */
public class AspectApp {
    public static void main(String[] args) {
        MyService myService = new AnnotationConfigApplicationContext(AspectConfig.class).getBean(MyService.class);
        myService.someMethod();
    }
}

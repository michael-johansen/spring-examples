package no.spring.helloworld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * User: Michael Johansen
 * Date: 06.01.14
 * Time: 12:28
 */
@Configuration
public class HelloWorldApp {
    @Bean
    public String greeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldApp.class);
        System.out.println("By name: " + context.getBean("greeting"));
        System.out.println("By type: " + context.getBean(String.class));
        context.close();
    }
}

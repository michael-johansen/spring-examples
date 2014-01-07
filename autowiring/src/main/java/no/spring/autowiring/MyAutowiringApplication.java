package no.spring.autowiring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * User: Michael Johansen
 * Date: 01.01.14
 * Time: 13:08
 */
public class MyAutowiringApplication {
    private static final Logger LOG = LoggerFactory.getLogger(MyAutowiringApplication.class);

    public static void main(String[] args) {
        LOG.info("Starting application");

        ApplicationContext context = new AnnotationConfigApplicationContext("no.spring.autowiring");

        MyService myService = context.getBean(MyService.class);
        myService.put("1", "Hello, World!");
        myService.put("2", "Hello, World!");
        myService.put("2", "Goodbye, World!");

        LOG.info("Application contains {} entries.", myService.count());
        LOG.info("Entry 1: {}", myService.get("1"));
        LOG.info("Entry 2: {}", myService.get("2"));

        LOG.info("Terminating application");
    }
}

package no.spring.tasks;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * User: Michael Johansen
 * Date: 01.01.14
 * Time: 15:14
 */
@Configuration
@EnableScheduling
@EnableAsync
@ComponentScan("no.spring.tasks")
public class MyTaskConfiguration {

}

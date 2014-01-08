package no.spring.aspect;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * User: Michael Johansen
 * Date: 07.01.14
 * Time: 15:43
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("no.spring.aspect")
public class AspectConfig {
}

package no.pub.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * User: Michael Johansen
 * Date: 07.01.14
 * Time: 10:44
 */
@Configuration
@EnableWebMvc
@ComponentScan("no.pub.web")
public class WebConfig {

}

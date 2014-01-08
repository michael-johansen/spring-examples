package no.spring.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * User: Michael Johansen
 * Date: 07.01.14
 * Time: 15:55
 */
@Service
public class MyServiceImpl implements MyService {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void someMethod(){
        logger.info("inside");
    }
}

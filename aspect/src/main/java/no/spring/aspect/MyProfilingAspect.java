package no.spring.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * User: Michael Johansen
 * Date: 07.01.14
 * Time: 15:46
 */
@Aspect
@Component
public class MyProfilingAspect {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Around("execution(* *(..))")
    public Object before(ProceedingJoinPoint pjp) throws Throwable {
        long start = System.nanoTime();
        Object retVal = pjp.proceed();
        logger.info("{} took: {} ns", pjp.getSignature().toString(), System.nanoTime() - start);
        return retVal;
    }

}

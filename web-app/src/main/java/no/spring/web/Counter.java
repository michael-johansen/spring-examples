package no.spring.web;

import org.springframework.stereotype.Component;

/**
 * User: Michael Johansen
 * Date: 10.01.14
 * Time: 13:08
 */
@Component
public class Counter {
    private int count = 0;

    public void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}

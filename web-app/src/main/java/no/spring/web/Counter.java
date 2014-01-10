package no.spring.web;

/**
 * User: Michael Johansen
 * Date: 10.01.14
 * Time: 13:08
 */
public class Counter {
    private int count = 0;

    public void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}

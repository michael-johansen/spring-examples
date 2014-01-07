package no.spring.autowiring;

/**
 * User: Michael Johansen
 * Date: 01.01.14
 * Time: 13:19
 */
public interface MyRepository  {
    long count();
    String get(String id);
    void put(String id, String value);
    boolean has(String id);
}

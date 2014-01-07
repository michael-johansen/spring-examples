package no.spring.autowiring;

/**
 * User: Michael Johansen
 * Date: 01.01.14
 * Time: 13:21
 */
public interface MyService {
    long count();
    String get(String id);
    void put(String id, String value);
    boolean has(String id);

}

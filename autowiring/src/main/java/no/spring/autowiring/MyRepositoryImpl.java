package no.spring.autowiring;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

/**
 * User: Michael Johansen
 * Date: 01.01.14
 * Time: 13:20
 */
@Repository
public class MyRepositoryImpl implements MyRepository {
    private final HashMap<String, String> map = new HashMap<>();

    @Override
    public long count() {
        return map.size();
    }

    @Override
    public String get(String id) {
        return map.get(id);
    }

    @Override
    public void put(String id, String value) {
        map.put(id, value);
    }

    @Override
    public boolean has(String id) {
        return map.containsKey(id);
    }
}

package no.spring.autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * User: Michael Johansen
 * Date: 01.01.14
 * Time: 13:24
 */
@Service
public class MyServiceImpl implements MyService {
    private final MyRepository myRepository;

    @Autowired
    public MyServiceImpl(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    @Override
    public long count() {
        return myRepository.count();
    }

    @Override
    public String get(String id) {
        return myRepository.get(id);
    }

    @Override
    public void put(String id, String value) {
        myRepository.put(id, value);
    }

    @Override
    public boolean has(String id) {
        return myRepository.has(id);
    }
}

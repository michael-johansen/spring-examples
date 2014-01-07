package no.spring.tasks;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

/**
 * User: Michael Johansen
 * Date: 01.01.14
 * Time: 15:22
 */
@Service
public class MyAsyncService {
    @Async
    public Future<Double> calculateAsync() {
        return new AsyncResult<>(calculate());
    }

    public Double calculate() {
        try {
            Thread.sleep(1000);
            return Math.random();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

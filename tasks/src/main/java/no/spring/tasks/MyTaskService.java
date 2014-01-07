package no.spring.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * User: Michael Johansen
 * Date: 01.01.14
 * Time: 15:22
 */
@Service
public class MyTaskService {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final MyAsyncService myAsyncService;

    @Autowired
    public MyTaskService(MyAsyncService myAsyncService) {
        this.myAsyncService = myAsyncService;
    }

    @Scheduled(fixedDelay = 5000)
    public void doStuff() throws ExecutionException, InterruptedException {
        logger.info("Average = " + getAverage(5));
        logger.info("Average = " + getAverageAsync(5000));
    }

    private Double getAverage(int numbers) {
        logger.info("Calling sync method " + numbers + " times");
        Double sum = 0.0;
        for (int i = 0; i < numbers; i++) {
            sum += myAsyncService.calculate();
        }
        logger.info("Done");
        return sum / numbers;
    }

    private Double getAverageAsync(int numbers) throws InterruptedException, ExecutionException {
        logger.info("Calling async method " + numbers + " times");
        List<Future<Double>> randomNumbers = getRandomNumbersAsync(numbers);
        Double sum = 0.0;
        for (Future<Double> randomNumber : randomNumbers) {
            sum += randomNumber.get();
        }
        logger.info("Done");
        return sum / randomNumbers.size();
    }

    private List<Future<Double>> getRandomNumbersAsync(int numbers) {
        List<Future<Double>> randomNumbers = new ArrayList<>();
        for (int i = 0; i < numbers; i++) {
            randomNumbers.add(myAsyncService.calculateAsync());
        }
        return randomNumbers;
    }
}

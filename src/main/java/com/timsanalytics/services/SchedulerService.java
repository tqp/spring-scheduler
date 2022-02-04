package com.timsanalytics.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Service
public class SchedulerService {
    private final Logger logger = LoggerFactory.getLogger(getClass().getName());

    // REF: https://reflectoring.io/spring-scheduler/

    // CRON EXPRESSION
    // Every 10 seconds: "*/10 * * * * *"
    @Scheduled(cron = "*/10 * * * * *")
    public void startScheduler() throws InterruptedException {
        logger.info("Executing CRON scheduled task: " + LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
    }

    // FIXED DELAY
//    @Scheduled(fixedDelay = 2000)
//    public void startScheduler() throws InterruptedException {
//        logger.info("Executing Fixed Delay Scheduled Task: " + LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
//        // added sleep to simulate method
//        // which takes longer to execute.
//        Thread.sleep(4000);
//    }

    // FIXED RATE
//    @Scheduled(fixedRate = 3000)
//    @Async
//    public void startScheduler() {
//        logger.info("Executing Fixed Rate Scheduled Task: " + LocalDateTime.now().toEpochSecond(ZoneOffset.UTC));
//    }
}

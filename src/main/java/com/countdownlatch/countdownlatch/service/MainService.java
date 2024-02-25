package com.countdownlatch.countdownlatch.service;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.stereotype.Service;

import com.countdownlatch.countdownlatch.threads.Thread1;
import com.countdownlatch.countdownlatch.threads.Thread2;
import com.countdownlatch.countdownlatch.threads.Thread3;

@Service
public class MainService {

    private CountDownLatch cdl = new CountDownLatch(3);
    private ExecutorService es = Executors.newFixedThreadPool(10);

    public void executeProcess() throws InterruptedException {
        es.submit(new Thread1(cdl));
        es.submit(new Thread2(cdl));
        es.submit(new Thread3(cdl));

        cdl.await();
        System.out.println("Count Down Latch Successful");
    }

}
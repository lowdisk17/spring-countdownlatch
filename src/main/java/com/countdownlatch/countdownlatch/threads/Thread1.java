package com.countdownlatch.countdownlatch.threads;

import java.util.concurrent.CountDownLatch;

public class Thread1 extends Thread {

    private CountDownLatch cdl;

    public Thread1 (CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run () {
        System.out.println("This is thread1");
        cdl.countDown();
    }
    
}

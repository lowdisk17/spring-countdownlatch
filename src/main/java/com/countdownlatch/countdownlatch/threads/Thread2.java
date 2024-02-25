package com.countdownlatch.countdownlatch.threads;

import java.util.concurrent.CountDownLatch;

public class Thread2 extends Thread {

    private CountDownLatch cdl;

    public Thread2 (CountDownLatch cdl) {
        this.cdl = cdl;
    }
    
    @Override
    public void run () {
        System.out.println("This is thread2");
        cdl.countDown();
    }
}

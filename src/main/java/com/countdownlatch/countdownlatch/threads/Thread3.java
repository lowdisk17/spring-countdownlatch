package com.countdownlatch.countdownlatch.threads;

import java.util.concurrent.CountDownLatch;

public class Thread3 extends Thread {

    private CountDownLatch cdl;

    public Thread3 (CountDownLatch cdl) {
        this.cdl = cdl;
    }

    @Override
    public void run () {
        System.out.println("This is thread3");
        this.cdl.countDown();
    }
    
}

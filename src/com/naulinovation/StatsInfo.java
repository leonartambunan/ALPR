package com.naulinovation;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class StatsInfo {

    public static AtomicInteger sendCount = new AtomicInteger();

    public static AtomicInteger sendError = new AtomicInteger();

    public static AtomicLong sendTimes = new AtomicLong();

    public static AtomicInteger receiveCount = new AtomicInteger();

    public static AtomicInteger receiveError = new AtomicInteger();

    public static String getView() {
        return "Send[" + sendCount.get() + ":" + sendTimes.get() + ":" + sendError.get() + "]; Receive["
                + receiveCount.get() + ":" + receiveError.get() + "]";
    }
}

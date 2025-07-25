package org.example.utils;

import java.util.concurrent.atomic.AtomicLong;

public class SeqNumberGemerator {
    private static final AtomicLong seqNumber = new AtomicLong(0);

    public static long getNextSeqNumber() {
        return seqNumber.getAndIncrement(); 
    } 
}

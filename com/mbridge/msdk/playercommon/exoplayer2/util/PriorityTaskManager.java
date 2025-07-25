package com.mbridge.msdk.playercommon.exoplayer2.util;

import com.ironsource.C21114v8;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes6.dex */
public final class PriorityTaskManager {
    private final Object lock = new Object();
    private final PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    /* loaded from: classes6.dex */
    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + C21114v8.C21123i.f54139e);
        }
    }

    public final void add(int i) {
        synchronized (this.lock) {
            this.queue.add(Integer.valueOf(i));
            this.highestPriority = Math.max(this.highestPriority, i);
        }
    }

    public final void proceed(int i) throws InterruptedException {
        synchronized (this.lock) {
            while (this.highestPriority != i) {
                this.lock.wait();
            }
        }
    }

    public final boolean proceedNonBlocking(int i) {
        boolean z;
        synchronized (this.lock) {
            if (this.highestPriority == i) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void proceedOrThrow(int i) throws PriorityTooLowException {
        synchronized (this.lock) {
            if (this.highestPriority != i) {
                throw new PriorityTooLowException(i, this.highestPriority);
            }
        }
    }

    public final void remove(int i) {
        int intValue;
        synchronized (this.lock) {
            this.queue.remove(Integer.valueOf(i));
            if (this.queue.isEmpty()) {
                intValue = Integer.MIN_VALUE;
            } else {
                intValue = this.queue.peek().intValue();
            }
            this.highestPriority = intValue;
            this.lock.notifyAll();
        }
    }
}

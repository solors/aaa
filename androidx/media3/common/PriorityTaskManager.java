package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.ironsource.C21114v8;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

@UnstableApi
/* loaded from: classes.dex */
public final class PriorityTaskManager {
    private final Object lock = new Object();
    private final PriorityQueue<Integer> queue = new PriorityQueue<>(10, Collections.reverseOrder());
    private int highestPriority = Integer.MIN_VALUE;

    /* loaded from: classes.dex */
    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + C21114v8.C21123i.f54139e);
        }
    }

    public void add(int i) {
        synchronized (this.lock) {
            this.queue.add(Integer.valueOf(i));
            this.highestPriority = Math.max(this.highestPriority, i);
        }
    }

    public void proceed(int i) throws InterruptedException {
        synchronized (this.lock) {
            while (this.highestPriority != i) {
                this.lock.wait();
            }
        }
    }

    public boolean proceedNonBlocking(int i) {
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

    public void proceedOrThrow(int i) throws PriorityTooLowException {
        synchronized (this.lock) {
            if (this.highestPriority != i) {
                throw new PriorityTooLowException(i, this.highestPriority);
            }
        }
    }

    public void remove(int i) {
        int intValue;
        synchronized (this.lock) {
            this.queue.remove(Integer.valueOf(i));
            if (this.queue.isEmpty()) {
                intValue = Integer.MIN_VALUE;
            } else {
                intValue = ((Integer) Util.castNonNull(this.queue.peek())).intValue();
            }
            this.highestPriority = intValue;
            this.lock.notifyAll();
        }
    }
}

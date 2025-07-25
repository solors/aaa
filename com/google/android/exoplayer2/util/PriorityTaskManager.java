package com.google.android.exoplayer2.util;

import com.ironsource.C21114v8;
import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* loaded from: classes4.dex */
public final class PriorityTaskManager {

    /* renamed from: a */
    private final Object f36142a = new Object();

    /* renamed from: b */
    private final PriorityQueue<Integer> f36143b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* renamed from: c */
    private int f36144c = Integer.MIN_VALUE;

    /* loaded from: classes4.dex */
    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i, int i2) {
            super("Priority too low [priority=" + i + ", highest=" + i2 + C21114v8.C21123i.f54139e);
        }
    }

    public void add(int i) {
        synchronized (this.f36142a) {
            this.f36143b.add(Integer.valueOf(i));
            this.f36144c = Math.max(this.f36144c, i);
        }
    }

    public void proceed(int i) throws InterruptedException {
        synchronized (this.f36142a) {
            while (this.f36144c != i) {
                this.f36142a.wait();
            }
        }
    }

    public boolean proceedNonBlocking(int i) {
        boolean z;
        synchronized (this.f36142a) {
            if (this.f36144c == i) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public void proceedOrThrow(int i) throws PriorityTooLowException {
        synchronized (this.f36142a) {
            if (this.f36144c != i) {
                throw new PriorityTooLowException(i, this.f36144c);
            }
        }
    }

    public void remove(int i) {
        int intValue;
        synchronized (this.f36142a) {
            this.f36143b.remove(Integer.valueOf(i));
            if (this.f36143b.isEmpty()) {
                intValue = Integer.MIN_VALUE;
            } else {
                intValue = ((Integer) Util.castNonNull(this.f36143b.peek())).intValue();
            }
            this.f36144c = intValue;
            this.f36142a.notifyAll();
        }
    }
}

package com.google.android.datatransport.runtime.time;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public class TestClock implements Clock {

    /* renamed from: a */
    private final AtomicLong f31323a;

    public TestClock(long j) {
        this.f31323a = new AtomicLong(j);
    }

    public void advance(long j) {
        if (j >= 0) {
            this.f31323a.addAndGet(j);
            return;
        }
        throw new IllegalArgumentException("cannot advance time backwards.");
    }

    @Override // com.google.android.datatransport.runtime.time.Clock
    public long getTime() {
        return this.f31323a.get();
    }

    public void tick() {
        advance(1L);
    }
}

package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public final class OnDemandCounter {

    /* renamed from: a */
    private final AtomicInteger f42415a = new AtomicInteger();

    /* renamed from: b */
    private final AtomicInteger f42416b = new AtomicInteger();

    public int getDroppedOnDemandExceptions() {
        return this.f42416b.get();
    }

    public int getRecordedOnDemandExceptions() {
        return this.f42415a.get();
    }

    public void incrementDroppedOnDemandExceptions() {
        this.f42416b.getAndIncrement();
    }

    public void incrementRecordedOnDemandExceptions() {
        this.f42415a.getAndIncrement();
    }

    public void resetDroppedOnDemandExceptions() {
        this.f42416b.set(0);
    }
}

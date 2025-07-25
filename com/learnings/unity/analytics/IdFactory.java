package com.learnings.unity.analytics;

/* loaded from: classes6.dex */
public class IdFactory {
    private static final Object LOCK = new Object();

    /* renamed from: id */
    private static long f54921id;

    public static long get() {
        long j;
        synchronized (LOCK) {
            j = f54921id + 1;
            f54921id = j;
        }
        return j;
    }
}

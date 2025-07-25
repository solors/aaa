package com.google.firebase.installations.time;

/* loaded from: classes4.dex */
public class SystemClock implements Clock {

    /* renamed from: a */
    private static SystemClock f43143a;

    private SystemClock() {
    }

    public static SystemClock getInstance() {
        if (f43143a == null) {
            f43143a = new SystemClock();
        }
        return f43143a;
    }

    @Override // com.google.firebase.installations.time.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }
}

package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public class daV {

    /* renamed from: IL */
    private long f21320IL;

    /* renamed from: bg */
    public long f21321bg;

    private daV(boolean z) {
        if (z) {
            eqN();
        }
    }

    /* renamed from: IL */
    public static daV m82420IL() {
        return new daV(false);
    }

    /* renamed from: bg */
    public static daV m82418bg() {
        return new daV(true);
    }

    /* renamed from: bX */
    public long m82419bX() {
        return SystemClock.elapsedRealtime() - this.f21320IL;
    }

    public void eqN() {
        this.f21321bg = System.currentTimeMillis();
        this.f21320IL = SystemClock.elapsedRealtime();
    }

    public String toString() {
        return String.valueOf(this.f21321bg);
    }

    /* renamed from: zx */
    public boolean m82416zx() {
        if (this.f21320IL > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    public long m82417bg(daV dav) {
        return Math.abs(dav.f21320IL - this.f21320IL);
    }
}

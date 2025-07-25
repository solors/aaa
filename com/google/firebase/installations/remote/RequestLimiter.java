package com.google.firebase.installations.remote;

import androidx.annotation.GuardedBy;
import com.google.firebase.installations.Utils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
class RequestLimiter {

    /* renamed from: d */
    private static final long f43136d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e */
    private static final long f43137e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a */
    private final Utils f43138a = Utils.getInstance();
    @GuardedBy("this")

    /* renamed from: b */
    private long f43139b;
    @GuardedBy("this")

    /* renamed from: c */
    private int f43140c;

    /* renamed from: a */
    private synchronized long m66727a(int i) {
        if (!m66726b(i)) {
            return f43136d;
        }
        return (long) Math.min(Math.pow(2.0d, this.f43140c) + this.f43138a.getRandomDelayForSyncPrevention(), f43137e);
    }

    /* renamed from: b */
    private static boolean m66726b(int i) {
        if (i != 429 && (i < 500 || i >= 600)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static boolean m66725c(int i) {
        if ((i < 200 || i >= 300) && i != 401 && i != 404) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private synchronized void m66724d() {
        this.f43140c = 0;
    }

    public synchronized boolean isRequestAllowed() {
        boolean z;
        if (this.f43140c != 0) {
            if (this.f43138a.currentTimeInMillis() <= this.f43139b) {
                z = false;
            }
        }
        z = true;
        return z;
    }

    public synchronized void setNextRequestTime(int i) {
        if (m66725c(i)) {
            m66724d();
            return;
        }
        this.f43140c++;
        this.f43139b = this.f43138a.currentTimeInMillis() + m66727a(i);
    }
}

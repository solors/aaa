package com.applovin.impl;

import android.content.Context;
import android.os.PowerManager;

/* renamed from: com.applovin.impl.gr */
/* loaded from: classes2.dex */
final class C4487gr {

    /* renamed from: a */
    private final PowerManager f6479a;

    /* renamed from: b */
    private PowerManager.WakeLock f6480b;

    /* renamed from: c */
    private boolean f6481c;

    /* renamed from: d */
    private boolean f6482d;

    public C4487gr(Context context) {
        this.f6479a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    /* renamed from: a */
    public void m98865a(boolean z) {
        if (z && this.f6480b == null) {
            PowerManager powerManager = this.f6479a;
            if (powerManager == null) {
                AbstractC5063oc.m96800d("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f6480b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f6481c = z;
        m98866a();
    }

    /* renamed from: b */
    public void m98864b(boolean z) {
        this.f6482d = z;
        m98866a();
    }

    /* renamed from: a */
    private void m98866a() {
        PowerManager.WakeLock wakeLock = this.f6480b;
        if (wakeLock == null) {
            return;
        }
        if (this.f6481c && this.f6482d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}

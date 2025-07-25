package com.applovin.impl;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.ironsource.C20747r8;

/* renamed from: com.applovin.impl.cs */
/* loaded from: classes2.dex */
final class C4210cs {

    /* renamed from: a */
    private final WifiManager f5407a;

    /* renamed from: b */
    private WifiManager.WifiLock f5408b;

    /* renamed from: c */
    private boolean f5409c;

    /* renamed from: d */
    private boolean f5410d;

    public C4210cs(Context context) {
        this.f5407a = (WifiManager) context.getApplicationContext().getSystemService(C20747r8.f52730b);
    }

    /* renamed from: a */
    public void m100050a(boolean z) {
        if (z && this.f5408b == null) {
            WifiManager wifiManager = this.f5407a;
            if (wifiManager == null) {
                AbstractC5063oc.m96800d("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f5408b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f5409c = z;
        m100051a();
    }

    /* renamed from: b */
    public void m100049b(boolean z) {
        this.f5410d = z;
        m100051a();
    }

    /* renamed from: a */
    private void m100051a() {
        WifiManager.WifiLock wifiLock = this.f5408b;
        if (wifiLock == null) {
            return;
        }
        if (this.f5409c && this.f5410d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
